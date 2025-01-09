package task5java;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enther the number of rows: ");
		int n= scanner.nextInt();
		
		for (int i=1; i<n; i++) {
			if(i%2 !=0) {
				System.out.print("*");
				if (i>1) {
					System.out.println(" *");
				}
				
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}
