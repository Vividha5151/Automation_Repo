package Array;

public class reverseprint {

	public static void main(String[] args) {
		
		int reverseorder [] = new int [10] ;
		System.out.println("Element present in array= " + reverseorder.length);
		System.out.println("Print elements of array in original order :- ");
		reverseorder[0] = 1;
		reverseorder[1] = 2;
		reverseorder[2] = 3;
		reverseorder[3] = 4;
		reverseorder[4] = 5;
		reverseorder[5] = 6;
		reverseorder[6] = 7;
		reverseorder[7] = 8;
		reverseorder[8] = 9;
		reverseorder[9] = 10;
		for (int i=0; i <reverseorder.length;i++) {
			System.out.println("  "+reverseorder[i]);
			
		} for (int i=reverseorder.length-1; i>=0; i--) {
			System.out.println("Print elements of array in reverse order  "+reverseorder[i]);
			
		}
				
		
	}

}
