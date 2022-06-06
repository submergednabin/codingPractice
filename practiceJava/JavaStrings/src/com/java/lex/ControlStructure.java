package com.java.lex;

/**
 * @author nabinkhatri
 *
 */
public class ControlStructure {
	
	public static void main(String[] args) {
		String username = "admin";
		String password = "Infy123";
		String s = username.equals("admin") && password.equals("Infy123")?"equals":"No";
//		if(username.equals("admin") && password.equals("Infy123")){
//			System.out.println("welcome");
//		}
//		System.out.println(s);
		display();
	}
	
	public static void display() {

//		do {
//			System.out.println(i);
//			i--;
//		}while (i<=1);
		for (int i=0; i < 10; i +=2) {
			System.out.print(i+"");
			++i;
		
//			if(j%2==1) {
//				continue;
//			}
//			if(j>6) {
//				break;
//			}
//			System.out.println(j);
			
		}
	}

}
