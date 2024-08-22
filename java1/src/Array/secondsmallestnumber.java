package Array;

public class secondsmallestnumber {

	public static void main(String[] args) {
	 int [] a = {101, 90, 50, 80, 65, 84, 125, 164, 88, 55, 105};
		 System.out.println("Element present in an array "+a.length);
         int x =0;
		 
		 for (int i=0; i<a.length;i++) {
			 for ( int j=i+1;j<a.length; j++) {
				if (a[i]>a[j]) {
					x =a [i];
					a[i]= a[j];
					a[j] = x;
				
				}
			 }System.out.println("Second smallest element in array ");
			 System.out.println(" "+a[0]);
				break;
		 }}}

		