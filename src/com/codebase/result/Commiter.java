package com.codebase.result;

import com.kdaud.concept.util.College;
import com.kdaud.concept.util.Student;

public class Commiter {
	
	public static void main(String[] args) {
		Student student=new Student();
		System.out.println(student.add(45, 47));
		System.out.println(student.mycourse("Gama", "Williams"));
		
		College college = new College();
		college.setName("Daud Kakumirizi");
		college.setCourseCode("BSS");
		college.setGpa(4.88);
		System.out.println(college.toString());
		
	}
	
}
