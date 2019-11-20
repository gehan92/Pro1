package DublicateRemove;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer [] num =new Integer[] {1,2,2,2,3,2,4,4,5,6,5,7,6,8};
		
		LinkedHashSet<Integer> link = new LinkedHashSet<>();
		
		for (int i = 0; i < num.length; i++) {
			link.add(num[i]);
		}
		
		System.out.println("Answer :" +link);
		System.out.println(link.size());
		
		int w = link.size();
		Integer [] num1 =new Integer[w];
		for (int i = 0; i < link.size(); i++) {
	
		}
		
		
	}

}
