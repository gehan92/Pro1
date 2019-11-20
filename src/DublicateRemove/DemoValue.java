package DublicateRemove;

public class DemoValue {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = arr.length; 
          
      //  System.out.println("---> "+removeDuplicates(arr, n));
        n = removeDuplicates(arr, n); 
   
        // Print updated array 
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 
		
		

	}

	public static int removeDuplicates(int[] arr, int n) {
		// TODO Auto-generated method stub
		 if (n==0 || n==1) { 
	            return n; 
		 }       
		 int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){
	        	
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	               // System.out.println( temp[j++]);
	            }
	            
	            
	         }  
	        
	        
	        temp[j++] = arr[n-1];  
	        
	        // Changing original array  
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
		 
		 
		
		return j;
	}

}
