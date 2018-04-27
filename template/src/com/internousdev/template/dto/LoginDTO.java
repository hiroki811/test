package com.internousdev.template.dto;

public class LoginDTO {

	  private String loginId;
	  private String loginPasssword;
	  private String userName;
	  private boolean loginFlg = false;
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginPasssword() {
		return loginPasssword;
	}
	public void setLoginPassword(String loginPasssword) {
		this.loginPasssword = loginPasssword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}



}
