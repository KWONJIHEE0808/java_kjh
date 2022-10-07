package kr.green.project.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.project.vo.BoardVO;

public interface BoardDAO {

	void insertBoard(@Param("b")BoardVO board);

}
