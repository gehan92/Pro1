package final_test;

public class Sort {

	public static void main(String[] args) {
		
		Integer [] numbers =new Integer[] {6,34,5,67,89,78,56,23,12,56,7};
		int temp =0;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int k = i+1; k < numbers.length; k++) {
				if(numbers[i]>numbers[k]) {
					
					temp=numbers[i];
					numbers[i]=numbers[k];
					numbers[k]=temp;
					
					
				}
			}
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		
	}

}
