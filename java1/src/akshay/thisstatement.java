package akshay;

public class thisstatement {
	 thisstatement(){
		this(90);
		System.out.println("I am zero-param cons..");
	}
	 thisstatement(int num){
		System.out.println("I am int-param cons..");
	}
	 thisstatement(double num){
		this(25,256.02);
		System.out.println("I am double-param cons..");
	}
	 thisstatement(int num1,double num2){
		this();
		System.out.println("I am int-double-param cons..");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");		
		 thisstatement ref3=new  thisstatement(25000.36);
		System.out.println("Program ends");
	}
}