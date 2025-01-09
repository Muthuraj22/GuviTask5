package task5java;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// Scanner
		Scanner text = new Scanner (System.in);
		
		System.out.println("Enter the String: ");
		String inputString = text.nextLine().toLowerCase();
		
		// Call Method
		if(isPalindrome(inputString)) {
			System.out.println("The String is Palindrome");
		} else {
			System.out.println("The String is not a Palindrome");
		}
		text.close();
	}
	
		// Method to check if the string is palindrome
		public static boolean isPalindrome(String str) {
			
			
		for(int i=0; i<str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
		
	}
		
}
