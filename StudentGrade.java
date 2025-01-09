package task5java;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the score: ");
		int score = scanner.nextInt();
		
		if(score>100) {
			System.out.println("Invalid Input");
		}
		else if (score == 100) {
			System.out.println("S");
		}
		else if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else if(score>=60) {
			System.out.println("D");
		}
		else if(score>=50) {
			System.out.println("E");
		}
		else {
			System.out.println("F");
		}
		scanner.close();
	}
}
