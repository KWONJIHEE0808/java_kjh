package kr.green.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.project.dao.BoardDAO;
import kr.green.project.vo.BoardVO;
import kr.green.project.vo.MemberVO;
import kr.green.project.service.BoardService;

@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public void insertBoard(BoardVO board, MemberVO user) {
		if(board == null || board.getBd_title() == null || board.getBd_content() == null)
			return;

		if(board.getBd_title().trim().length() == 0)
			return;

		if(board.getBd_content().trim().length() == 0)
			return;

		if(user == null || user.getMe_id() == null)
			return;

		board.setBd_me_id(user.getMe_id());
		boardDao.insertBoard(board);
	}

}
