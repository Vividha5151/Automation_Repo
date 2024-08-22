
public class operations {

	public static void main(String[] args) {
	int num1=50, num2=30;
	boolean result = (num1==num2);
		
		System.out.println("num1 and num2 comparision using '==' "+ result);
		System.out.println("num1 and num2 comparision using '<' "+ (num1<num2));
		System.out.println("num1 and num2 comparision using '>' "+ (num1>num2));
		System.out.println("num1 and num2 comparision using '<=' "+ (num1<=num2));
		System.out.println("num1 and num2 comparision using '=>' "+ (num1>=num2));
		
	int num3=-5, num4=-20;
	boolean result1 =  (num1==num2);
		
		System.out.println("num3 and num4 comparision using '==' "+ result);
		System.out.println("num3 and num4 comparision using '<' "+ (num3<num4));
		System.out.println("num3 and num4 comparision using '>' "+ (num3>num4));
		System.out.println("num3 and num4 comparision using '<=' "+ (num3<=num4));
		System.out.println("num3 and num4 comparision using '=>' "+ (num3>=num4));


		//&&
	int num5=50, num6=100;
	boolean result2 = (num5>num6)&& (num6<num5);
	System.out.println("result "+result2);

	
	//||or
	int num7=50, num8=100;
	boolean result3 = (num7>num8)|| (num7<num8);
	System.out.println("result "+result3);

		
		
		
	}

}


/*
 * == two equal values
 * ! - two not equal values
 * < - smaller than
 * > - greater than
 * <= - smaller than equal to
 * >= - greater than equal to
 * 
 * && - and
 * in && operations
 *            true && true = true
 *            true && false = false
 *            false && false = false
 *            
 *  || -or
 *  in or operations
 *            true || true = true
 *            false || false = false
 *            true || false = true          
 */













