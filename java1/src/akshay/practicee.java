package akshay;

public class practicee {
	practicee (){
		System.out.println("vivi");
	}
	
	
	practicee (int num){
		System.out.println("i m int param const");
		age =num;
	}
	public static void main(String[] args) {
		
		practicee ref = new practicee(25);
		System.out.println(" age-  "+ref.age);
		ref.testing();
		practicee ref1 = new practicee(50);
		System.out.println(" age-  "+ref1.age);
		ref.testing();
		
		
		System.out.println("program ends");
	}
	void testing() {
		System.out.println("program starts");
	}
	int age;
	
}
