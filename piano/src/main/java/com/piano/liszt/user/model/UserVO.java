package com.piano.liszt.user.model;

public class UserVO {
	String uid;
	String name;
	String pwd;
	String re_pwd;
	String email;
	String grade;
	String reg_dt;
	String start_day;
	int ing_status;
	
	
	

	public int getIng_status() {
		return ing_status;
	}

	public void setIng_status(int ing_status) {
		this.ing_status = ing_status;
	}

	public String getStart_day() {
		return start_day;
	}

	public void setStart_day(String start_day) {
		this.start_day = start_day;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRe_pwd() {
		return re_pwd;
	}

	public void setRe_pwd(String re_pwd) {
		this.re_pwd = re_pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getReg_dt() {
		return reg_dt;
	}

	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}

	@Override
	public String toString() {
		return "UserVO [uid=" + uid + ", name=" + name + ", pwd=" + pwd + ", re_pwd=" + re_pwd + ", email=" + email
				+ ", grade=" + grade + ", reg_dt=" + reg_dt + "]";
	}
}
