UPDATE board
SET
	bd_up = (SELECT
			COUNT(*)
		FROM
			likes
		WHERE
			bd_num = li_target_num
				AND li_target = 'board'
                AND li_state = 1),
	bd_down = (SELECT
			COUNT(*)
		FROM
			likes
		WHERE
			bd_num = li_target_num
				AND li_target = 'board'
                AND li_state = -1);