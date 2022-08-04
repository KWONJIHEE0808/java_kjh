package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{
	
	@Autowired
	MemberDAO memberDao;

	@Override
	public boolean signup(MemberVO member) {
		if(member == null) {
			return false;
		}if(member.getMe_id() == null || member.getMe_id().length() == 0) {
			return false;
		}if(member.getMe_pw() == null || member.getMe_pw().length() == 0) {
			return false;
		}if(member.getMe_email() == null || member.getMe_email().length() == 0) {
			return false;
		}if((member.getMe_gender() != 'M' && member.getMe_gender() != 'F')) {
			return false;
		}if(member.getMe_birth() == null) {
				return false;
		}		
		
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		if(dbMember != null)
			return false;
		
		memberDao.insertMember(member);
		return true;
	}

	@Override
	public MemberVO login(MemberVO member) {
		if(member == null || member.getMe_id() == null) {
			return null;
		}
		
		//가입된 아이디가 아니면
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		if(dbMember == null) {
			return null;
		}

		if(dbMember.getMe_pw().equals(member.getMe_pw())) {
			return dbMember;
		}
		

		return null;
	}
}

