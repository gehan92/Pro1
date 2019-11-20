package final_test;

public class StringRevers {

	public static void main(String[] args) {
		
		String name [] =new String [] {"Saman","is","name","My"};
		String temp=null;
		
		for (int i = 0; i < name.length/2; i++) {
			
			temp=name[i];
			name[i]=name[name.length-1-i];
			name[name.length-1-i]=temp;
			
		}
		
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		
		System.out.println();
		
		String names = "MyNameIsSamanMaduranga";
		
		char[] uname = names.toCharArray();
		
		for (int i = uname.length-1; i >=0; i--) {
			
			System.out.print(uname[i]);
		}
		
		
		
		
	}

}
