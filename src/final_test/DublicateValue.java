package final_test;

import java.util.LinkedHashSet;

public class DublicateValue {

	public static void main(String[] args) {
		
		System.out.println("Using LinkHashSet------------------------------------");
		Integer numbers[] = new Integer[] {1,2,3,4,3,3,3,32,21,1,2,1,2,5,6,7};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		LinkedHashSet<Integer>num =new LinkedHashSet<>();
		
		for (int i = 0; i < numbers.length; i++) {
			
			num.add(numbers[i]);
		}
		System.out.println();
		System.out.print(num);
		
		//////////////////////////////////////////////////////////////////////////////////////
		
		int[] numbers1 = {1,2,3,4,3,3,3,32,21,1,2,1,2,5,6,7};
		
		int p = numbers1.length;
		
		p = CheckthePattern(numbers1,p);
		
		for (int i = 0; i < p; i++) {
			
			System.out.print(numbers1[i]+" ");
		}

	}

	private static int CheckthePattern(int[] numbers1, int p) {
		
		if(p==0||p==1) {
			
			return p;
			
		}
		
		int temp[] = new int[p];
		int j =0;
		
		for (int i = 0; i < p-1; i++) {
			
				if(numbers1[i]!=numbers1[i+1]) {
					temp[j++]=numbers1[i];
				}
		}
		
		
			temp[j++] = numbers1[p-1];
			
			for (int i = 0; i < j; i++) {
				
				numbers1[i]=temp[i];
			}
			
	System.out.println();
		
		
		
		return j;
	}

}
