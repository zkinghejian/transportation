package com.trans.pojo;

public class User {

	private String phoneno;
	private String username;
	private String password;
	private int usertype;
	
	public User() {
		
	}

	public User(String phoneno, String username, String password, int usertype) {
		super();
		this.phoneno = phoneno;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
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

	@Override
	public String toString() {
		return "User [phoneno=" + phoneno + ", username=" + username + ", password=" + password + ", usertype="
				+ usertype + "]";
	}
	
	
}
