package com.assertions;
public class Student {
	private String fName;
	private String lName;
	public Student(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	public String getFullName() {
		assert fName != "":"First name must not be empty";
		assert fName != null:"First name must not be null";
		assert lName != null:"Last name must not be null";
		return fName.concat(" ").concat(lName);
	}
}