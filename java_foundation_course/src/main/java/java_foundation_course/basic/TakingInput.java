package java_foundation_course.basic;

import java.util.Scanner;

public class TakingInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your lucky number ");
		int num1 = scanner.nextInt();
		System.out.println("Your number is: " + num1);
		System.out.println("Enter your name");
		String name = scanner.next();
		System.out.println(name);
		//-----------------------------------------------
		System.out.println("Enter a character");
		char c=scanner.next().charAt(0);
		System.out.println(c);
	}
}
