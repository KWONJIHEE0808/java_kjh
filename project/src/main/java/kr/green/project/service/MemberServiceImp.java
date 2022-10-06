package kr.green.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.project.dao.MemberDAO;
import kr.green.project.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	MemberDAO memberDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public boolean signup(MemberVO member) {
			if(member == null)
				return false;			
			if(member.getMe_id() == null || member.getMe_id().length() == 0)
				return false;			
			if(member.getMe_pw() == null || member.getMe_pw().length() == 0)
				return false;			
			if(member.getMe_email() == null || member.getMe_email().length() == 0)
				return false;
			if(member.getMe_name() == null || member.getMe_name().length() == 0)
				return false;	
			if(member.getMe_phone() == null || member.getMe_phone().length() == 0)
				return false;			
			if(member.getMe_birth() == null)
				return false;

			MemberVO dbMember = memberDao.selectMember(member.getMe_id());
			if(dbMember != null)
				return false;
			
			String encodePw = passwordEncoder.encode(member.getMe_pw()); 
			member.setMe_pw(encodePw);
			
			memberDao.insertMember(member);
			return true;
		}

	@Override
	public MemberVO login(MemberVO member) {
		if(member == null || member.getMe_id() == null) {
			return null;
		}
		MemberVO dbMember = memberDao.selectMember(member.getMe_id());
		if(dbMember == null) {
			return null;
		}
		if(passwordEncoder.matches(member.getMe_pw(), dbMember.getMe_pw())) {
			return dbMember;
		}
		return null;
	}
	
}
