package final_test;

public class IntegerReverse {

	public static void main(String[] args) {

		Integer numbers[] = new Integer[]{23,4,56,43,2,3,5,6,7};
		
		int temp=0;
		for (int i = 0; i < numbers.length/2; i++) {
			
			temp= numbers[i];
			numbers[i]=numbers[numbers.length-i-1];
			numbers[numbers.length-i-1]=temp;
			
			
		}
		
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}

	}

}
