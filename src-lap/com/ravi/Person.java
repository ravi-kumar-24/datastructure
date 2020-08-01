package com.ravi;

public class Person {

	public int id;
	public  String name;
	public String add;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String add) {
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	
	
	
}
