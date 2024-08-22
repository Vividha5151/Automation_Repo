package akshay;

public class javabasic {

	javabasic(int num){
			System.out.println("I am int-param cons..");
			age=num;}

	public static void main(String[] args) {		
		System.out.println("Program starts");
		
		javabasic ref=new 	javabasic(25);
		System.out.println("Age: "+ref.age);
		ref.testing();
		javabasic ref1=new 	javabasic(50);
		System.out.println("Age: "+ref1.age);
		ref1.testing();
		
		System.out.println("Program ends");
	}	
	void testing() {
		System.out.println("I am testing()...");
	}	
	int age;
}