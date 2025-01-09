package task5java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner text1 = new Scanner (System.in);
		
		System.out.println("Enter the string: ");
		String inputString = text1.nextLine();
		
		String s2 = new StringBuilder(inputString).reverse().toString();
		System.out.println("Reversed String: " + s2);
		text1.close();
	}

}
