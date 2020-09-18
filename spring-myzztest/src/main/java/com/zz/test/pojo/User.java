package com.zz.test.pojo;



public class User {

	private String name;
	private int IDcard;
	private int age;
	private String work;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIDcard() {
		return IDcard;
	}

	public void setIDcard(int IDcard) {
		this.IDcard = IDcard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", IDcard=" + IDcard +
				", age=" + age +
				", work='" + work + '\'' +
				'}';
	}
}
