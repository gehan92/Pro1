package sorting;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "MyNameIsGehan";
		
		char[] a = input.toCharArray();
		
		for (int i = a.length-1; i >=0 ; i--) {
			System.out.print(a[i]);
		}
		
		String tem=null;
		String [] st = new String[] {"we","are","gret","people"};
		
		for (int i = 0; i < st.length/2; i++) {
			
			
			tem = st[i];
			System.out.println("tem :"+st[i]);
			st[i]= st[st.length-i-1];
			System.out.println("st[i] :"+st[st.length-i-1]);
			st[st.length-i-1]=tem;
			System.out.println("st[st.length-i-1] :"+tem);
		}
		
		for (int i = 0; i < st.length; i++) {
			System.out.print(" "+st[i]);
		}
		
	}

}
