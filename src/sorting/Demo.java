package sorting;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp =0;
		Integer [] num = new Integer[] {25,85,4,14,5,68,32,45,98,65,7,2};
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < 12; j++) {
				
				
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					
				}
				
			}
			
		}
		
		
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " +num[i]);
		}
		
		
		
	}

}
