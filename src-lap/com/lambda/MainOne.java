package com.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.test.Person;

public class MainOne {
	
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(1, "Ravinda", "Bangalore"),
											 new Person (2,"Sumit", "Khurai"),	
											 new Person (3,"Ashish", "Allahabad"),
											 new Person (4,"Ankita", "Chhatapur"),
											 new Person (4,"Aarav", "Dhanpuri"),
											 new Person (4,"Anshul", "Chhhatarpr"));
		persons.stream()
		.sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
		.filter(p -> p.getName().startsWith("A"))
		.forEach(p -> System.out.println(p.getName()));
	}
	
}
