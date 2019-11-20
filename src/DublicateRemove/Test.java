package DublicateRemove;

public class Test {

	public static void main(String[] args) {
	
		Integer numberrs [] = new Integer[] {1,1,1,1,3,3,4,4,4,4,4,5,5,5,6};
		
		int q =numberrs.length;
		System.out.println("-----><---- " + q);
		int t= Calculate(q,numberrs);
		
		System.out.println("---------->>> "+Calculate(q,numberrs));
		
		for (int i=0; i<t; i++)  {
	           System.out.print(numberrs[i]+" "); 
		}
	}

	private static int Calculate(int q, Integer[] numberrs) {
		
		if(q==0 || q==1) {
			System.out.println("ret q-->"+q);
			return q;
			
		}
		
		Integer temp [] = new Integer[q];
		int j =0;
		
		for (int i = 0; i <q-1; i++) {
			
			if(numberrs[i] != numberrs[i+1]) {
				
				temp[j++]=numberrs[i];
				
			}
			
		}
		
		temp[j++]=numberrs[q-1];
		System.out.println("6666 ");
		
		for (int i = 0; i <j; i++) {
			numberrs[i]=temp[i];
		}
		
		return j;
	}

}
