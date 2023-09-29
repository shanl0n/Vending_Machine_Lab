package com.codebase.machine;

public enum Code {
	A1("A1"),
	B2("B2"),
	C3("C3");

	Code(String value) {
		this.value = value;
	}

	private final String value;

	public String getValue() {
	return this.value;}


}
