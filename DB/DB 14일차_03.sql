drop trigger if exists update_likes;

delimiter //
create trigger update_likes after insert on likes
for each row
begin
	if old.li_target like 'board' and old.li_state = 1 then
		update board set bd_up = bd_up -1 where bd_num = old.li_target_num;
    end if;
    if old.li_target like 'board' and old.li_state = -1 then
		update board set bd_down = bd_down -1 where bd_num = old.li_target_num;
    end if;
    if new.li_target like 'board' and new.li_state = 1 then
		update board set bd_up = bd_up +1 where bd_num = new.li_target_num;
    end if;
	if new.li_target like 'board' and new.li_state = -1 then
		update board set bd_down = bd_down +1 where bd_num = new.li_target_num;
    end if;
end //
delimiter ;

update likes set li_state = 0 where li_num = 1;