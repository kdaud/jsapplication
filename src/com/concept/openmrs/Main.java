package com.concept.openmrs;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		College<Integer>number=new College<Integer>(99);
		System.out.println("The number is : " + number.getS());
		
		//Dummy obj = new Dummy();
		//obj.myfunction(student);
		//obj.myfunction(marks);
		List<Dummy>list=new ArrayList<>();
		list.add(new Dummy(100, "Makanga"));
		list.add(new Dummy(101, "Ronald"));
		System.out.println(list.toString());
		
	}
	
}
