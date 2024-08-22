
public class nsgvexample {

	 int num1=40,num2=60;
	 static int result;
	 //if use result in boolean answer will get in .0, int for direct result, use any keyword
	public static void main(String[] args) {
		//to access NS members first create object or instance
		nsgvexample ref=new nsgvexample();
		
		System.out.println("NSGV num1= "+ref.num1);
		System.out.println("NSGV num2= "+ref.num2);
		
		//direct method to access
		result=ref.num1+ref.num2;
		System.out.println("NSGV rsult= "+result);
		// standard method
		 nsgvexample.result=ref.num1+ref.num2;
		System.out.println("NSGV rsult= "+nsgvexample.result);
		
		
		
		
	}

}
