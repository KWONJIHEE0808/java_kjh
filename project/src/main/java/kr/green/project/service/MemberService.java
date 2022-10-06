package kr.green.project.service;

import kr.green.project.vo.MemberVO;

public interface MemberService {
	
	boolean signup(MemberVO member);

	MemberVO login(MemberVO member);
	
}
