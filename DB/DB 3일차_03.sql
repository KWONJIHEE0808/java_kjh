-- 1970년대 이후에 출생한 사람의 아이디와 이름을 조회하는 쿼리문
select userID,userName from cookdb.usertbl where birthYear >= 1970;

-- 회원의 키가 180~182인 사람의 이름과 키를 조회
select userName,height from cookdb.usertbl where height between 180 and 182;

-- 지역이 경남 or 충남 or 경북인 사람의 이름과 주소를 조회
select userName,addr from cookdb.usertbl where addr in ('경남','충남','경북');

-- 성이 김씨인 회원의 이름과 키를 조회
select userName,height from cookdb.usertbl where userName like '김%';

-- 1970년대 출생한 회원의 아이디와 이름을 조회
select userID,userName from cookdb.usertbl where birthYear between 1970 and 1979;

-- 2013년에 가입한 회원의 모든 정보를 조회
select * from cookdb.usertbl where mDate like '2013%';

-- KHD 회원이 구매한 제품을 조회
select prodName from cookdb.buytbl where userID like 'KHD';

-- 회원의 키가 180~182인 회원중 경북에 사는 회원 정보를 조회
select * from cookdb.usertbl where height between 180 and 182 and addr = '경북';

-- 회원의 키가 180 미만이거나 182 초과인 회원 정보를 조회
select * from cookdb.usertbl where height < 180 or height > 182;
select * from cookdb.usertbl where !(height between 180 and 182);

-- 회원의 키가 180 미만이거나 182 초과중 경남에 사는 회원 조회
select * from cookdb.usertbl where (height < 180 or height > 182) and addr = '경남';

-- 김용만 회원보다 키가 큰 회원의 회원정보를 조회
select * from cookdb.usertbl where height > (select height from cookdb.usertbl where userName = '김용만');

-- 경기 지역에 사는 회원보다 키가 큰 회원의 회원정보를 조회
select * from cookdb.usertbl where height > all(select height from cookdb.usertbl where addr = '경기');

-- KHD 회원이 구매한 제품과 동일한 제품을 구매한 회원정보를 조회
select * from cookdb.buytbl where userID != 'KHD' and prodName = any(select prodName from cookdb.buytbl where userID = 'KHD');
select * from cookdb.buytbl where userID != 'KHD' and prodName in(select prodName from cookdb.buytbl where userID = 'KHD');

-- 구매 목록을 userID와 prodName 순으로 정렬하여 조회
select * from cookdb.buytbl order by userID asc, prodName asc;

-- 회원들이 구매한 제품목록 조회
select distinct prodName from buytbl; 