package com.dxc.entity;

public class Person {
	private String ID;
	private String userName;
	private String passWord;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String iD, String userName, String passWord) {
		super();
		ID = iD;
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	

}
