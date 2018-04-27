package com.trans.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

public class IndexInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String username ;//varchar2(40) not null,
	private String email ;//varchar2(30),
	private String phoneno ;// varchar2(30) not null,
	private String problem ;//varchar2(512) not null,
	private Timestamp infotime ;//timestamp not null
	
	
	public IndexInfo() {
		super();
	}


	public IndexInfo(String username, String email, String phoneno, String problem, Timestamp infotime) {
		super();
		this.username = username;
		this.email = email;
		this.phoneno = phoneno;
		this.problem = problem;
		this.infotime = infotime;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getProblem() {
		return problem;
	}


	public void setProblem(String problem) {
		this.problem = problem;
	}


	public Timestamp getInfotime() {
		return infotime;
	}


	public void setInfotime(Timestamp infotime) {
		this.infotime = infotime;
	}


	@Override
	public String toString() {
		return "IndexInfo [username=" + username + ", email=" + email + ", phoneno=" + phoneno + ", problem=" + problem
				+ ", infotime=" + infotime + "]";
	}
	
	
	
}
