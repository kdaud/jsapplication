package com.data.concept;

public class College {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		new College().showMe("Engineer");
		;
	}
	
	private void showMe(String msg) {
	//		String mymsg = "Software ";
	//		System.out.println(mymsg.toLowerCase());
	//		System.out.println(mymsg.concat(msg).toUpperCase());
	//		System.out.println(mymsg.substring(2, 8));
	//		System.out.println(mymsg);
		for (int y = 0; y < 100; y++) {
			//System.out.println("y " + y);
		}
		int[] marks = { 40, 42, 43, 41, 55 };
		for (int xx : marks) {
			;
			System.out.println(xx + 19);
		}
		String mymessage = "Software Engineering";
		char[] mylist = mymessage.toCharArray();
		for (char ss : mylist) {
			System.out.println("List: " + ss);
		}
		
	}
	
}
