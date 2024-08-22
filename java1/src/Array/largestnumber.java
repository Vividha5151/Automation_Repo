package Array;

public class largestnumber {

	public static void main(String[] args) {
	
		int largestnumber[]  = new int [] {50, 60, 70, 55, 84, 25, 75, 05, 90, 01};  
		
		System.out.println("element present in array "+ largestnumber.length);
		
		int max = largestnumber[0];  
		
		for ( int i =0; i<largestnumber.length;i++ ) {
		if ( largestnumber[i]>max)
			max= largestnumber[i];
		
		}
		System.out.println("Largest element present in given array: " + max);  
		
	}

}
