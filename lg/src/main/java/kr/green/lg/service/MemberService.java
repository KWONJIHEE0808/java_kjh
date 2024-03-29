package kr.green.lg.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.green.lg.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO member);

	boolean isUser(MemberVO member);

	boolean sendEmail(String title, String content, String writer);

	boolean emailActive(MemberVO member);

	MemberVO login(MemberVO member);

	void updateMemberSession(MemberVO user);

	MemberVO loginBySession(String me_s_id);

	void logout(HttpServletRequest request, HttpServletResponse response);
}