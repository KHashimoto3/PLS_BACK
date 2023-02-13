package com;

public class LoginInput {
	private final String name;
	private String pass;
	
	public LoginInput(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}
	
	
	
}
