drop trigger if exists insert_likes;

delimiter //
create trigger insert_likes after insert on likes
for each row
begin
	declare _state int;
    declare _table varchar(20);
    declare _num int;
    set _state = new.li_state;
    set _table = new.li_target;
    set _num = new.li_target_num;
    if _state = 1 and _table like 'board' then
		update board set bd_up = bd_up + 1 where bd_num = _num;
	end if;
    if _state = -1 and _table like 'board' then
		update board set bd_down = bd_down + 1 where bd_num = _num;
	end if;
end //
delimiter ;

insert into likes(li_us_id, li_state, li_target, li_target_num)
	values('qwer1234', 1, 'board', 6);
insert into likes(li_us_id, li_state, li_target, li_target_num)
	values('admin123', 1, 'board', 6);