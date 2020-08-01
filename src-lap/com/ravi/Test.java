package com.ravi;

import java.util.LinkedList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("hello");
		List<Person>  pList = getPersons();
		for (Person person : pList) {
			System.out.println(person.id+" "+person.name +" "+person.add);
		}
		
	}

	public static List<Person> getPersons() {
		List<Person> list = new LinkedList<Person>();
		Person person;
		
		for (int i = 0; i <5; i++) {
			 person = new Person();
			person.id=i;
			person.name="test"+i;
			person.add="add"+i;
			list.add(person);
			person = null;
		}
		return list;
	}
}
