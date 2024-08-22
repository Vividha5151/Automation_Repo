package ifelse;

public class Largstinthree {

	public static void main(String[] args) {
		int num1=50,num2=20,num3=10;
		if(num1>num2 && num1>num3) {
			System.out.println("greater no. "+num1);
		}else if(num2>num3) {
			System.out.println("greater no. "+num2);
		}else if(num1>num3) {
			System.out.println("greater no. "+num3);
		}else {
			System.out.println("largest no. "+ num1);
		}
	}}

