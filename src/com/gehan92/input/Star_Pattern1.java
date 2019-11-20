package com.gehan92.input;

public class Star_Pattern1 {

	public void Home() {
		
		for (int i = 0; i <6; i++) {
			for (int j = 0; j <21 ; j++) {
				System.out.print(" ");
			}
			
			
			for (int j = 6; j >=6-i; j--) {
				System.out.print("*");
			}
			System.out.println();
						
		}
		
		
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <28 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for (int i = 0; i <6; i++) {
			for (int j = 0; j <21 ; j++) {
				System.out.print(" ");
			}
			
			
			for (int j = i; j <6; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <23; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i <11; i++) {
			
			for (int j = 0; j <3; j++) {
				System.out.print("*");
			}
			
			for (int j = 3; j <20; j++) {
				System.out.print(" ");
			}
			for (int j = 20; j <=22; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <23; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
}
