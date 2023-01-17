package com;

public class LoginInput {
	private final String name;
	private final String pass;
	
	public LoginInput(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}
	
	public String getName() {
		return name;
	}
	public String getPass() {
		return pass;
	}
}
