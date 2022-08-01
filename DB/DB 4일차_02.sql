-- 각 회원이 구매한 총 개수
-- sum(속성명) : 속성명에 있는 값을 누적합
-- sum(속성명)이 order by와 같이 사용되면 그룹화한 속성을 기준으로 누적합
SELECT userId, sum(amount) as 구매량 FROM cookdb.buytbl group by userId;

-- 각 회원이 구매한 횟수를 조회
select userId, count(userId) from cookdb.buytbl group by userId;

-- 각 제품을 산 회원들의 수
select prodName, count(distinct userId) from cookdb.buytbl group by prodName;

-- 각 구매별 구매 금액을 조회
select (price * amount) as 구매금액 from cookdb.buytbl;

-- 회원별 구매 총 금액을 조회
select userId, sum(price * amount) as 총구매금액 from cookdb.buytbl group by userId;

-- 회원별 구매 총 금액이 500원 이상인 구매 내역을 조회
select userId, sum(price * amount) as 총구매금액 from cookdb.buytbl group by userId 
	having sum(price * amount) >= 500;
    
-- 가장 많이 구매한 회원의 아이디를 조회
select userId, sum(price * amount) as 총구매금액 from cookdb.buytbl group by userId
	order by 총구매금액 desc
    limit 1;

-- 경남에 사는 회원의 수를 조회
select count(userName) from cookdb.usertbl where addr = '경남';

-- 각 지역에 사는 회원의 수를 조회
select addr, count(userId) as 회원수 from cookdb.usertbl group by addr;

-- 경남지역에 사는 회원들이 구매한 제품 목록을 조회
select distinct prodName from cookdb.buytbl where userId
	in (select userId from cookdb.usertbl where addr = '경남');
select distinct prodName from cookdb.buytbl where userId
	= any (select userId from cookdb.usertbl where addr = '경남');