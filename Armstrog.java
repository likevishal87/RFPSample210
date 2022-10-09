package com.bridgelabz.basic;

import java.util.Scanner;

public class Armstrog {
	public static boolean checkArmstrongNumber(int number) {
		int armstrong = 0;
		int storeValue = number;
		while (number > 0) {
			int remainder = number % 10;
			armstrong = (int) Math.pow(remainder, 3) + armstrong;// pow return-double
			number = number / 10;
		}
		if (storeValue == armstrong)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int number = sc.nextInt();
		boolean b = checkArmstrongNumber(number);
		if (b)
			System.out.println("Number is Armstrong:");
		else
			System.out.println("Number not armstrong");

	}

}
