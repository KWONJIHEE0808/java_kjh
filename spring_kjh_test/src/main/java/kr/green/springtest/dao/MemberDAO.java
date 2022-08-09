package kr.green.springtest.dao;

import org.apache.ibatis.annotations.Param;

import kr.green.springtest.vo.MemberVO;

public interface MemberDAO {

	public MemberVO selectMember(@Param("me_id")String me_id);

	public void insertMember(@Param("m")MemberVO member);
}