package com.bridgelabz.basic;

import java.util.Scanner;

public class PositiveorNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ther Number : ");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
		}
	}

}
