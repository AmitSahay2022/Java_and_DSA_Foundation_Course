package java_foundation_course.basic;

import java.util.Scanner;

public class SimpleInterestCalc {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter rate of interest");
       float rate=sc.nextFloat();
       System.out.println("Enter principle");
       double principle=sc.nextDouble();
       System.out.println("Enter time");
       float time=sc.nextFloat();
       double si=(rate*principle*time)/100;
       System.out.println(si);
	}
}
