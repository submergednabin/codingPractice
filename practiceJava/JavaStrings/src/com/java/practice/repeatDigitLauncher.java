package com.java.practice;

public class repeatDigitLauncher {

	public static void main(String[] args) {

		lookAndSay(1213200012171979L);


	}
	
	public static long lookAndSay(long num) {
		
		String number = String.valueOf(num);
		int length = number.length();
		char temp;
		if(length%2==0) {
			for(int i=0; i<length; i++) {

				if(i%2==0) {
					char a = number.charAt(i);
					String value = String.valueOf(a);
					
					int val = Integer.parseInt(value);
					while(val>0) {
						
						temp = number.charAt(i+1);
						
						System.out.print(temp);
						val--;
					}
				}
			}
		}
		else {
			return -1;
		}
		
		return 0;
				
	}

}
