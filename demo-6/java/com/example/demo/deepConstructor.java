package com.example.demo;

public class deepConstructor {
	
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
	private String name;
	private String age;
	
	deepConstructor(String n, String a){
		this.name = n;
		this.age= a;
	}
	deepConstructor(deepConstructor s){
		this.name = new String(s.name);
		this.age = new String(s.age);// deep constructor creating new object
	}
}
