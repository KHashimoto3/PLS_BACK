package com;

public class WandboxInput {
	private final String code;
	private final String stdin;
	private final String options;
	private final String compiler;
	private final String compiler_option_raw;
	
	public WandboxInput(String code, String stdin, String options, String compiler, String compiler_option_raw) {
		super();
		this.code = code;
		this.stdin = stdin;
		this.options = options;
		this.compiler = compiler;
		this.compiler_option_raw = compiler_option_raw;
	}

	public String getCode() {
		return code;
	}

	public String getStdin() {
		return stdin;
	}

	public String getOptions() {
		return options;
	}

	public String getCompiler() {
		return compiler;
	}

	public String getCompiler_option_raw() {
		return compiler_option_raw;
	}
	
	
	
	
	
}
