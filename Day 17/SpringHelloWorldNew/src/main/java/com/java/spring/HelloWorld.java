package com.java.spring;

public class HelloWorld {
	
	private String welcomeNote;
	private String supportNote;
	private String helpNote;
	private String endNote;
	public String getWelcomeNote() {
		return welcomeNote;
	}
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}
	public String getSupportNote() {
		return supportNote;
	}
	public void setSupportNote(String supportNote) {
		this.supportNote = supportNote;
	}
	public String getHelpNote() {
		return helpNote;
	}
	public void setHelpNote(String helpNote) {
		this.helpNote = helpNote;
	}
	public String getEndNote() {
		return endNote;
	}
	public void setEndNote(String endNote) {
		this.endNote = endNote;
	}
	
	public void show(String sname) {
		System.out.println(welcomeNote);
		System.out.println(supportNote + sname);
		System.out.println(helpNote);
		System.out.println(endNote);
	}
}
