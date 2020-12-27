package com.data.concept;


public class Patient {
	
	public String callfunction() {
		String buffer = new String("Computer Engineering");
		char[] characters = buffer.toCharArray();
		
		char [] myletter="Kakumirizi-`Daud`".toCharArray();
		for (int ss : characters) {
			System.out.println("Value @: " + ss);
		}
		System.out.println("**********");
		
		for (int x = 0; x < myletter.length; x++) {
			System.out.println(myletter[x]);
		}
		
		int [] myArray= {4,2,6,8,1,3,5};
		int []numArray= {3,7,1,1,9,4,6};
		openmrs:
		for(int x: myArray) {
			for (int c : numArray) {
				if (x + c == 8) {
					System.out.println("The value of x is: " + x + " and the value of c is: " + c);
					continue;
				}
			}
		}	
			
		for (int f : myArray) {
			if (f == 7) {
				break;
			}
			System.out.println("The Value of f is : " + f);
		}
			//			if ((x + x) == 10) {
			//				System.out.println("The value of x is " + x);
			//				break;
			//			}
	
		return null;
	}
	
}
