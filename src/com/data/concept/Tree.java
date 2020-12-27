package com.data.concept;

import java.util.HashMap;
import java.util.Map;

public class Tree {
	
	private int age;

	static {
		System.out.println("Welcome To Datastructures ^ algorithms");
	}
	
	private String myData(String name) {
		Map<String, Character> course=new HashMap<String, Character>();
		course.put("Information Security", 'A');
		course.put("Advanced Linux", 'A');
		course.put("PC Repair and Maintainance", 'A');
		course.put("Operating System", 'A');
		course.put("Parallel ^ Distributed System", 'A');
		course.put("Catering", 'A');
		course.put("IT Project II", 'A');
		
		course.forEach((K, H) -> System.out.println(K + " -> " + H));
		return name;
	}
	
	public void myRes() {
		this.myData("");
	}
	
}
