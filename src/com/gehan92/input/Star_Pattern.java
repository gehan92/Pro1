package com.gehan92.input;

public class Star_Pattern {


	public void starpattern(int d) {
		
		for (int i =0 ; i <d; i++) {
			
			for (int j = d; j >=0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		System.out.println("-----------------------------------------------");
		
		for (int i = 0; i <d; i++) {
			for (int j =i ; j <d; j++) {
				System.out.print(" ");
			}
			
			for (int j =0; j <=i; j++) {
				System.out.print("*");
			}
			
			for (int j =0; j <i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
			//System.out.println();
			
			
			
		
			//System.out.println("-----------------------------------------------");	
			for (int i = 0; i <d; i++) {
				
				for (int j = 0; j <=i; j++) {
					System.out.print(" ");
				}
				for (int j = d; j >i; j--) {
					System.out.print("*");
				}
				for (int j = 1; j <d-i ; j++) {
					System.out.print("*");
				}
				
				System.out.println();
				
			}
			
		
	}
	
	
}
