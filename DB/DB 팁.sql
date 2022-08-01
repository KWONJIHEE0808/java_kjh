-- 1학년 1반 1번 학생의 이름을 고길동으로 수정하는 쿼리문
update 학생
	set
		이름 = '고길동'
	where 학년 = 1 and 반 = 1 and 번호 = 1;
    
select * from 학생;

-- 1학년 1반 2번 학생의 1학년 1학기 국어 성적을 조회
select * from score.보유 where 
	학생번호 = (select 학생번호 from score.학생 where 학년 = 1 and 반 = 1 and 번호 = 2) and 
	성적번호 = (select 성적번호 from score.성적 where 학년 = 1 and 학기 = 1 and 과목명 = '국어');