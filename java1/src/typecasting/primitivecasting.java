package typecasting;

public class primitivecasting {

	public static void main(String[] args) {
	int num =20;
	double num1= num;// lower to higher widening- implicit- compiler
	double num2= (double) num;// lower to higher widening- explicit- programmer
	System.out.println("num "+num);//20
	System.out.println("num1 "+num1);//20.0
	System.out.println("num2 "+num2);//20.0
	
	float num3=25.36f;
	double num4= num3;
	double num5= (double)num3;
	System.out.println("num3 "+num3);//25.36
	System.out.println("num4 "+num4);//25.36
	System.out.println("num5 "+num5);//25.36 
	
	//narrowing examples- only explicitily- narrowing is not possible implicitly
	
	double x= 25.36;
	int y=(int) x;
	long z= (long)x;
	float p= (float)x; 
	System.out.println("x= "+x);
	System.out.println("y= "+y);
	System.out.println("z= "+z);
	System.out.println("p= "+p);
	
	}

}
