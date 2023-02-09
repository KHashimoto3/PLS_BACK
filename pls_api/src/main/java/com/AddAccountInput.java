package com;

public class AddAccountInput {
	private final String name;
	private final String pass;
	
	public AddAccountInput(String name, String pass) {
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
