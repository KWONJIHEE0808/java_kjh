drop database if exists shoppingmall;
create database if not exists shoppingmall;
use shoppingmall;

drop table if exists `user`;
CREATE TABLE if not exists `user` (
	`us_id`	varchar(20)	NOT NULL,
	`us_pw`	varchar(20)	NULL,
	`us_birth`	date	NULL,
	`us_address`	varchar(100)	NULL,
	`us_authority`	varchar(5)	NULL
);

drop table if exists `product`;
CREATE TABLE if not exists `product` (
	`pr_code`	char(6)	NOT NULL,
	`pr_title`	varchar(30)	NULL,
	`pr_detail`	longtext	NULL,
	`pr_price`	int	NULL,
	`pr_type`	varchar(10)	NULL
);

drop table if exists `option`;
CREATE TABLE if not exists `option` (
	`op_num`	int	NOT NULL auto_increment,
	`op_size`	varchar(10)	NULL,
	`op_amount`	int	NULL,
	`op_pr_code`	char(6)	NOT NULL,
    primary key(op_num)
);

drop table if exists `buy`;
CREATE TABLE if not exists `buy` (
	`bu_num`	int	NOT NULL auto_increment,
	`bu_address`	varchar(100)	NULL,
	`bu_us_id`	varchar(20)	NOT NULL,
	`bu_op_num`	int	NOT NULL,
    primary key(bu_num)
);

ALTER TABLE `user` ADD CONSTRAINT `PK_USER` PRIMARY KEY (
	`us_id`
);

ALTER TABLE `product` ADD CONSTRAINT `PK_PRODUCT` PRIMARY KEY (
	`pr_code`
);

ALTER TABLE `option` ADD CONSTRAINT `FK_product_TO_option_1` FOREIGN KEY (
	`op_pr_code`
)
REFERENCES `product` (
	`pr_code`
);

ALTER TABLE `buy` ADD CONSTRAINT `FK_user_TO_buy_1` FOREIGN KEY (
	`bu_us_id`
)
REFERENCES `user` (
	`us_id`
);

ALTER TABLE `buy` ADD CONSTRAINT `FK_option_TO_buy_1` FOREIGN KEY (
	`bu_op_num`
)
REFERENCES `option` (
	`op_num`
);

-- 관리자 정보를 등록하는 쿼리문 작성(주소와 생일은 NULL)
insert into user(us_id, us_pw, us_authority)
	values('admin', 'admin', 'ADMIN');
    
-- 관리자가 다음 제품을 등록
-- 코드 : ABC001, 분류 : 상의, 제품명 : 셔츠, 상세 : 셔츠입니다, 가격 : 10000
-- 크기 : xs, 수량 : 10
-- 크기 : s, 수량 : 10
-- 크기 : m 수량 : 10
-- 크기 : l, 수량 : 10
-- 크기 : xl, 수량 : 10

insert into product(pr_code, pr_title, pr_detail, pr_price, pr_type)
	values('ABC001', '셔츠', '셔츠입니다', 10000, '상의');
    
insert into `option` values
	(1, 'xs', 10, 'ABC001'),
	(2, 's', 10, 'ABC001'),
    (3, 'm', 10, 'ABC001'),
    (4, 'l', 10, 'ABC001'),
    (5, 'xl', 10, 'ABC001');
    
-- id가 abc123, 비번 abc123, 주소가 청주시, 생일 2000-01-01인 회원이 회원가입
alter table user
	change us_authority us_authority varchar(5) not null default 'USER';
    
insert into user(us_id, us_pw, us_birth, us_address)
	values('abc123', 'abc123', '2000-01-01', '청주시');

-- abc 123 회원이 ABC001 제품 xl를 구매했을때 쿼리문 (구매시 입력한 주소는 청주시)
insert into buy(bu_num, bu_address, bu_us_id, bu_op_num)
	select 'abc123', op_num, '청주시' from `option`
		where op_pr_code = 'ABC001' and op_size = 'xl';

update `option`
	set
		op_amount = op_amount -1
	where op_pr_code = 'ABC001' and op_size = 'xl';
    
-- 관리자가 다음 제품을 등록
-- 코드 : DEF001, 분류 : 신발, 제품명: 신상운동화, 상세 : 신상운동화입니다, 가격 : 20000
-- 크기 : 220, 수량 : 10
-- 크기 : 230, 수량 : 10
-- 크기 : 240, 수량 : 10
-- 크기 : 250, 수량 : 10
-- 크기 : 260, 수량 : 10

insert product(pr_code, pr_title, pr_detail, pr_price, pr_type)
	values('DEF001', '신상운동화', '신상운동화입니다', 20000, '신발');
    
insert into `option` (op_size, op_amount, op_pr_code) values
	('220', 10, 'DEF001'),
	('230', 10, 'DEF001'),
    ('240', 10, 'DEF001'),
    ('250', 10, 'DEF001'),
    ('260', 10, 'DEF001');

-- abc123 회원이 DEF001 제품을 220과 260 구매했을때 쿼리문
insert into buy(bu_us_id, bu_op_num, bu_address)
	select 'abc123', op_num, '청주시' from `option`
		where op_pr_code = 'DEF001' and op_size in ('220', '260');
        
update `option`
	set
		op_amount = op_amount -1
	where op_pr_code = 'DEF001' and op_size in ('220','260');
 
-- 관리자가 다음 제품을 등록
-- 코드 : ABC002, 분류 : 상의, 제품명: 니트, 상세 : 니트입니다, 가격 : 30000
-- 크기 : l, 수량 : 10
insert product(pr_code, pr_title, pr_detail, pr_price, pr_type)
	values('ABC002', '니트', '니트입니다', 30000, '상의');
    
insert into `option` (op_size, op_amount, op_pr_code) values
	('l', 10, 'ABC002');

-- abc123 회원의 누적 구매액을 조회
select us_id, sum(pr_price) as 누적구매액 from product
	join `option`
		on `option`.op_pr_code = product.pr_code
	join buy
		on buy.bu_op_num = `option`.op_num
	join `user`
		on `user`.us_id = buy.bu_us_id
	where us_id = 'abc123';	
    
select us_id, sum(pr_price) as 누적구매액 
	from (select * from buy where us_id = 'abc123')
    as tmp
	join `option`
		on `option`.op_pr_code = product.pr_code
	join buy
		on buy.bu_op_num = `option`.op_num
	join `user`
		on `user`.us_id = buy.bu_us_id;
        
-- 모든 제품에 대해 각 제품별 구매 횟수를 조회(동일 회원 구매도 포함)
select pr_title, count(bu_num) as 구매횟수 from product
	left join `option`
		on op_pr_code = pr_code
	left join buy
		on bu_op_num = op_num
    group by pr_code;
    
-- 위에보다 간단한 방법
select op_pr_code as 제품, count(bu_num) as 구매횟수 from buy
	right join `option` on bu_op_num = op_num
	group by op_pr_code;
    
-- 모든 제품에 대해 각 제품별, 옵션별 구매 횟수를 조회(동일 회원 구매도 포함)
select op_pr_code as 제품, op_size as 옵션, count(bu_num) as '옵션별 구매 횟수' 
	from buy
	right join `option` on bu_op_num = op_num
	group by op_num;
    
-- 제품코드가 ABC001인 제품 정보를 조회
-- (제품코드, 제품명, 제품상세, 제품분류, 가격, 구매 가능한 사이즈)
select pr_code, pr_title, pr_detail, pr_type, pr_price, op_size as '구매 가능한 사이즈' 
	from product
    join `option` on op_pr_code = pr_code
    where pr_code = 'ABC001'and op_amount > 0;
    
-- abc123 회원이 구매한 제품 목록(제품명)을 조회(중복X)
select bu_us_id, pr_title from buy
    join `option` on op_num = bu_op_num
    join product on op_pr_code = pr_code
    where bu_us_id = 'abc123'
    group by pr_code; -- distinct 사용X
    
-- 2000년생 회원들의 구매 제품 목록을 조회
select pr_code from buy
    join `option` on op_num = bu_op_num
    join product on op_pr_code = pr_code
    join `user` on bu_us_id = us_id
    where us_birth like '2000%'
    group by pr_code;

