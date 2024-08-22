package Array;

public class rightrotateelement {

	public static void main(String[] args) {
		  //Initialize array 
	    int[] array = {1,2,3,4,5};
	 
	    //k determines the number of times an array is to be rotated 
	    int k = 2;
	 
	    System.out.println("Original Array");
	    //Displays the original array  
	   // System.out.println(rightrotateelement.toString(array));
	 
	    //Calls the right rotation function
	    rightRotation(array,k);
	    //Displays the rotated array
	    System.out.println("After right rotation Array");
	    System.out.println("rightrotateelement.toString(array)");
	  }
	 
	  public static void rightRotation(int[] arr, int k) {
	    k = k%arr.length;
	    for(int i = 0; i < k; i++) {    
	      int j, last;    
	      //Stores the last element of the array    
	      last = arr[arr.length-1];    
	      for(j = arr.length-1; j > 0; j--) {    
	        //Shift element of array by one    
	        arr[j] = arr[j-1];    
	      }    
	      //Last element of array will be added to the start of array.    
	      arr[0] = last;            
	    }
	  
	}

}
