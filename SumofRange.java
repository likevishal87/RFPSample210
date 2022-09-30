package com.bridgelabz.basic;

import java.util.Scanner;

public class SumofRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ther Number : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int sum = 0;
		for (int i = n1; i <= n2; i++)
			sum += i;
		System.out.println(sum);
	}

}
