package kr.green.project.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemberVO {
	private String me_id;
	private String me_pw;
	private String me_email;
	private String me_name;
	private String me_phone;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date me_birth;
	private String me_post_code;
	private String me_addr;
	private String me_addr_detail;
	private int me_authority;
}
