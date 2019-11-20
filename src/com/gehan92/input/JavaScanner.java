package com.gehan92.input;

import java.util.Scanner;

public class JavaScanner {

	public static void main(String[] args) {
		
		System.out.print("Enter user name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("My name is "+name);
		
	System.out.print("Enter number of lines : ");
		int d = sc.nextInt();
		
		Star_Pattern Star = new Star_Pattern();
		Star.starpattern(d);
		
		Star_Pattern1 Star1 = new Star_Pattern1();
		Star1.Home();
		
		Numbers num = new Numbers();
		num.Numbers();
		num.Numbers2(d);
		;
	}

}
