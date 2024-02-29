package com.tcs.training;

import java.util.Scanner;

public class TypesVariables {

	public static void main(String[] args) {

		int a = 200;
		int b = 90;
		int c = 0;

		if (a < 10)
			c = a + b;
		if (a > 10)
			c = a - b;
		boolean result = a > b && a > c;
		// false & true are boolean literals
		result = false == false;
		result = false == (result = true);
		result = !true;

		boolean flag = true;

		if (flag == true) {
			System.out.println(flag);
		} else {
			System.out.println(flag);
		}

		if (flag) {
			System.out.println(flag);
		}
		System.out.println(result);
		System.out.println(c);

		a = -20;

		if (a != 0) {
			if (a < 0) {
				System.out.println("Negative");
			} else {
				System.out.println("Positive");
			}
		} else {
			System.out.println("Zero");
		}
		/*
		 * Scanner sc = new Scanner(System.in); int input = sc.nextInt();
		 */

		int total = 575;
		int subjects = 6;

		double score = total / subjects;

		if (score > 90) {
			System.out.println("A+");
		} else if (score > 80) {
			System.out.println("A");
		} else if (score > 70) {
			System.out.println("B");
		} else if (score > 50) {
			System.out.println("C");
		} else if (score < 50) {
			System.out.println("D");
		}
		
		
		
	}

}
