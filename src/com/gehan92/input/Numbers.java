package com.gehan92.input;

public class Numbers {
	
	public void Numbers() {
		int a=1;
		int t=4;
		for (int i = 0; i <4; i++) {
			
			for (int j = a; j <=t; j++) {
				System.out.print(j+"  ");
				
			}
			a=t+1;
			t=t+4;
			
			System.out.println();
		}
		System.out.println();
		
	}
	
	
   public void Numbers2(int d) {
		
		for (int i = 0; i <d; i++) {
			for (int j =i ; j <d; j++) {
				System.out.print(" ");
			}
			
			for (int j =0; j <=i; j++) {
				System.out.print(i);
			}
			
			for (int j =0; j <i; j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		

	}

   
   
   
}
