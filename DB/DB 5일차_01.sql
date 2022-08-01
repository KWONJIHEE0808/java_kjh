use green2;

-- 각 학생들이 가야할 학부 사무실 위치를 조회
-- 지금처럼 속성 이름이 다른 경우, 테이블명과 .을 생략해도됨
select 학생.* from 학생 
	join 학부 
		on 학생.학부 = 학부.학부명
	order by 학생번호 asc;
    
use cookdb;

-- 구매 테이블과 사용자 테이블을 join 하는 쿼리문 작성
select * from usertbl
	join buytbl
		on usertbl.userId = buytbl.userId; 
        
-- 강호동 회원이 구매한 제품 목록 조회
select usertbl.userId, userName, prodName from usertbl
	join buytbl
		on usertbl.userId = buytbl.userId
	where userName = '강호동';

select userId, '강호동'as userName, prodName from buytbl
	where userId = (select userID from usertbl where userName = '강호동');
  
-- 운동화를 구매한 회원의 아이디 조회
select distinct prodName, userID from buytbl
	where prodName = '운동화';

-- 운동화를 구매한 회원이 사는 지역들을 조회
select distinct prodName, addr from buytbl
	join usertbl
		on usertbl.userId = buytbl.userId
	where prodName = '운동화';	

use 대학생2;

-- 각 학생들의 지도 교수님 이름을 조회
select 학생.이름, 교수.이름 from 교수
	join 학생
		on 학생.교번 = 교수.교번;
        
-- 고길동 학생이 수강하는 강좌들 코드를 조회
select 학생.이름, 강좌코드 from 수강
	join 학생
		on 학생.학번 = 수강.학번
	where 학생.이름 = '고길동';

-- 고길동 학생이 수강하는 강좌들 이름(강좌명) 조회
select 학생.이름, 강좌명 from 강좌
	join 수강
		on 수강.강좌코드 = 강좌.강좌코드
	join 학생
		on 학생.학번 = 수강.학번
	where 학생.이름 = '고길동';
    
-- 나영석 교수가 강의하는 강좌코드 조회
select 교수.이름, 강좌코드 from 강좌
	join 교수
		on 교수.교번 = 강좌.교번
	where 교수.이름 = '나영석';

-- 나영석 교수가 강의하는 강좌명을 조회
select 교수.이름, 강좌명 from 강좌
	join 교수
		on 교수.교번 = 강좌.교번
	where 교수.이름 = '나영석';

-- 나영석 교수가 강의하는 강의를 듣는 학생이름을 조회
select distinct 학생.학번, 학생.이름 as 학생이름, 교수.이름 as 교수이름, 강좌.강좌명 from 학생
	join 수강
		on 학생.학번 = 수강.학번
	join 강좌
		on 강좌.강좌코드 = 수강.강좌코드
	join 교수
		on 교수.교번 = 강좌.교번
	where 교수.이름 = '나영석';
    
-- 컴퓨터개론을 수강하는 학생들의 수를 조회
select 강좌명, count(*) as 수강생수 from 강좌
	join 수강
		on 수강.강좌코드 = 강좌.강좌코드
	where 강좌.강좌명 = '컴퓨터개론';
    
-- 컴퓨터개론을 수강하는 학생들 이름을 조회
select 강좌명, 학생.이름 from 강좌
	join 수강
		on 수강.강좌코드 = 강좌.강좌코드
	join 학생
		on 학생.학번 = 수강.학번
	where 강좌.강좌명 = '컴퓨터개론';
    
-- 나영석 교수의 지도 학생들 이름을 조회
select 교수.이름 as 교수이름, 학생.이름 as 학생이름 from 학생
	join 교수
		on 교수.교번 = 학생.교번
	where 교수.이름 = '나영석';
    
select * from 학생 join 교수;
