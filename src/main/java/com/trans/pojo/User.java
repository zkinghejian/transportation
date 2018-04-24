package com.trans.pojo;

import java.sql.Timestamp;

import oracle.sql.TIMESTAMP;

public class User {

	private String phoneno;
	private String username;
	private String password;
	private int usertype;
	
	private Timestamp lastLoginTime;
	
	public User() {
		
	}
    
	public User(String phoneno, String username, String password, int usertype, Timestamp lastLoginTime) {
		super();
		this.phoneno = phoneno;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
		this.lastLoginTime = lastLoginTime;
	}


	public User(String phoneno, String username, String password, int usertype) {
		super();
		this.phoneno = phoneno;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}
	
	public User(String phoneno, String username, String password) {
		this(phoneno,username,password,0);
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUsertype() {
		return usertype;
	}

	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}
	
	

	public Timestamp getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Override
	public String toString() {
		return "User [phoneno=" + phoneno + ", username=" + username + ", password=" + password + ", usertype="
				+ usertype + ", lastLoginTime=" + lastLoginTime + "]";
	}

	
	
}
