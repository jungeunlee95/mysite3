package com.cafe24.mysite.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class GuestbookVo {
	
	private Long no;
	
	@NotEmpty
	private String name;
	
	@NotNull
	@Length(min=3)
	private String password;
	
	@NotEmpty 
	private String contents;
	
	private String regDate;
	
	public GuestbookVo() {
		super();
	}
	
	public GuestbookVo(Long no, String name, String password, String contents, String regDate) {
		this.no = no;
		this.name = name;
		this.password = password;
		this.contents = contents;
		this.regDate = regDate;
	}
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "Guestbookvo [no=" + no + ", name=" + name + ", password=" + password + ", contents=" + contents
				+ ", regDate=" + regDate + "]";
	}

	public Long getNo2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
