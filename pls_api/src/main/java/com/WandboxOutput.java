package com;

public class WandboxOutput {
	private String status;
	private String compiler_message;
	private String program_message;
	private String compiler_error;
	private String program_output;
	
	
	public WandboxOutput() {
		
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCompiler_message() {
		return compiler_message;
	}

	public void setCompiler_message(String compiler_message) {
		this.compiler_message = compiler_message;
	}

	public String getProgram_message() {
		return program_message;
	}

	public void setProgram_message(String program_message) {
		this.program_message = program_message;
	}

	public String getCompiler_error() {
		return compiler_error;
	}

	public void setCompiler_error(String compiler_error) {
		this.compiler_error = compiler_error;
	}

	public String getProgram_output() {
		return program_output;
	}

	public void setProgram_output(String program_output) {
		this.program_output = program_output;
	}
	
	
}
