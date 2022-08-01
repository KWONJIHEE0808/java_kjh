use score;

-- 각 학생들의 성적을 조회
select * from 학생
	left join 보유
		on 학생.학생번호 = 보유.학생번호
	left join 성적
		on 보유.성적번호 = 성적.성적번호;
        
select * from 보유
	right join 학생
		on 학생.학생번호 = 보유.학생번호
	left join 성적
		on 보유.성적번호 = 성적.성적번호;
        
use 대학생2;
INSERT INTO `대학생2`.`강좌` (`강좌코드`, `강좌명`, `교번`) 
	VALUES ('MSC003', '이산수학', '2022160001');
    
-- 각 강좌의 수강생 수를 조회
select 강좌명, count(수강.학번) as 수강생수 from 수강 
	right join 강좌
		on 수강.강좌코드 = 강좌.강좌코드
    group by 수강.강좌코드;