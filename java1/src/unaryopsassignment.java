
 public class unaryopsassignment {

	public static void main(String[] args) {
		//int x=5,y;
		//y=x;
		//y=--x + x-- + ++x + x + x++ + --x;
		
		//System.out.println("x: "+x);//4
		//System.out.println("y: "+y);//24

		//int x=-3,y;
		//y=x;
		//y=--x + x-- + --x + x-- + x++ + ++x;
		
		//System.out.println("x: "+x);//-5
       // System.out.println("y: "+y);//-32
		
        //reinitilisation
        
		int x=11,y;
		y=x;
		y=x++ + --x + x++ + x-- + ++x + ++x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
	}

}

