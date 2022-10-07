package kr.green.project.service;

import kr.green.project.vo.BoardVO;
import kr.green.project.vo.MemberVO;

public interface BoardService {

	void insertBoard(BoardVO board, MemberVO user);
}
