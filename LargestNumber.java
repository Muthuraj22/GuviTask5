package task5java;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second Number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the Third Number: ");
		int num3 = sc.nextInt();

		if(num1>=num2 && num1>=num3) {
			System.out.println("First Number "+num1+" is Largest");
		} else if (num2>=num1 && num2>=num3) {
			System.out.println("Second Number "+num2+ " is Largest");
		}  else 
			System.out.println("Third Number "+num3+ " is Largest");
		sc.close();
	}

}
