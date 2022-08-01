drop database if exists green2; -- 데이터베이스 삭제
create database if not exists green2; -- 데이터베이스 생성
use green2; -- 데이터베이스 사용

create table if not exists 학생(
	학생번호 int auto_increment,
    이름 char(6),
    primary key(학생번호)
);

-- drop table if exists 학생; -- 학생 테이블 삭제

-- alter table 학생 -- 학생 테이블에 학과 속성을 삭제
	-- drop 학과; 
alter table 학생 -- 학생 테이블에 학과 속성을 추가
	add 학과 char(6);
 
alter table 학생 -- 학생 테이블에 학과 속성을 학부로 변경
	change 학과 학부 char(6);
alter table 학생 -- 학생번호에 자동증가를 제거
	change 학생번호 학생번호 int;
alter table 학생 -- 기본키 삭제
	drop primary key;
alter table 학생 -- 기본키 추가
	add primary key(학생번호);
alter table 학생
	drop primary key;   

-- drop table if exists 학부;

CREATE TABLE if not exists `학부` (
  `학부명` char(6) NOT NULL,
  `학부위치` char(45) DEFAULT NULL,
  PRIMARY KEY (`학부명`)
);

alter table 학생 add foreign key(학부) references 학부(학부명);
-- 학생 테이블에 학부 속성을 외래키로 지정

-- 학부 테이블에 컴퓨터공학부를 추가(그린대학교 1관 401호)
-- 속성명 생략 > 테이블 생성시 추가한 속성들의 순서대로 입력
insert into 학부 values('컴퓨터공학부', '그린대학교 1관 401호');

-- 학부 테이블에 기계 공학부를 추가(그린대학교 1관 201호)
-- 속성명 입력 > 입력한 속성명 순서대로 입력 
insert into 학부(학부위치, 학부명) values('그린대학교 1관 201호', '기계공학부');

-- 학부테이블에 전자 공학부를 추가
-- 생략한 속성이 있는 경우, 생략한 속성에는 기본값으로 저장(기본값을 설정 안한 경우 NULL)
-- NOT NULL 설정한 속성은 생략하면 안됨 > 가능한 경우는 기본키가 auto_increment 된 경우
insert into 학부(학부명) values('전자공학부');

-- 학생 테이블에 컴퓨터공학부 홍길동 학생 정보를 추가하는 쿼리문 작성
insert into 학생 values(1,'홍길동', '컴퓨터공학부');

-- 컴퓨터공학부 학부위치가 그린대학교 2관 101호로 이동했을때 수정하는 쿼리문 작성
-- update에서 set에 있는 '='는 값을 수정하는 역할, where에 있는 '='는 값을 비교하는 역할
update 학부
	set 
		학부위치 = '그린대학교 2관 101호'
    where 
		학부명 = '컴퓨터공학부';
        
-- 홍길동 학생의 이름을 고길동으로 수정하는 쿼리문 작성
update 학생
	set
		이름 = '고길동'
	where
		이름 = '홍길동';
        
-- 1번 학생의 데이터를 삭제하는 쿼리문 작성
delete from 학생 where 학생번호 = 1;

insert into 학생(학생번호,이름, 학부) values
	(1,'홍길동', '컴퓨터공학부'), 
    (2,'고길동', '기계공학부'), 
    (3,'이순신', '전자공학부'), 
    (4,'유관순', '컴퓨터공학부'), 
    (5,'임꺽정', '컴퓨터공학부');
