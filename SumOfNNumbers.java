package com.bridgelabz.basic;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("Sum of numbers : " + sum);
	}
}
