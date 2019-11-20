package final_test;

public class Dublicate {

	public static void main(String[] args) {
		
		int a[] ={1,2,3,4,3,3,3,32,21,1,2,1,2,5,6,7};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j =0; j < a.length; j++) {
				
				if(a[i]==a[j]) {
					
					System.out.print(a[i]+" ");
					
				}
				
			}
			
			
		}
		
		

	}

}
