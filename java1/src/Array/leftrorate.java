package Array;

public class leftrorate {

	public static void main(String[] args) {
	
		 int [] rotate = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  
	        int n = 5;  
	        System.out.println("Original elements: ");  
	        for (int i = 0; i < rotate.length; i++) {  
	            System.out.print(" "+rotate[i]);  
	        }  
	        
	        for(int i = 0; i < n; i++){  
	            int j, first;  
	            first = rotate[0];  
	            for(j = 0; j < rotate.length-1; j++){  
	            	rotate[j] = rotate[j+1];  
	            }  
	            rotate[j] = first;  
	        }  
	        System.out.println();  
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i<rotate.length; i++){  
	            System.out.print(rotate[i] + " ");  
	        }  
	    }  
	}  
		