-- 학생이 추가되면 해당 학생의 담당 교수님을 자동으로 배정하는 프로시저
drop procedure if exists insert_student;
delimiter // -- 쿼리의 마지막을 ; 대신 // 로 사용하겠다는 의미
creatstudente procedure insert_student(
	in i_st_num char(10),
    in i_st_name varchar(10)
)
begin
	declare _department_code char(3); -- 학생정보추가
	insert student(st_num, st_name) values(i_st_num, i_st_name); -- 학과코드추출
    set _department_code = substr(i_st_num, 5, 3);
    update student -- 학과코드와 일치하는 교수님을 찾아 지도 교수에 교수번호를 업데이트
		set
			st_pr_num = (select pr_num from professor 
				where pr_num like concat('____',_department_code,'%') limit 1)
		where st_num = i_st_num;
end //
delimiter ;