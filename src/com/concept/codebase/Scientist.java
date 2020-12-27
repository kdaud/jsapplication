package com.concept.codebase;


public interface Scientist {
	
	public void myData();
	
	default void myCareer() {
		for (int y = 10; y <= 20; y++) {
			System.out.println("Count Down: " + y);
		}
	}
	
}
