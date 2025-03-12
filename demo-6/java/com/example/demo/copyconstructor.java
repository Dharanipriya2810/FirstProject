package com.example.demo;

public class copyconstructor {
	
	private String name;
	private String age;
	
	copyconstructor(String name,String age){
		this.name = name;
		this.age = age;
	}
	copyconstructor(copyconstructor s){
		this.name = s.name;
		this.age= s.age;
	}// shalloe constructor -> reference copy not a object
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
