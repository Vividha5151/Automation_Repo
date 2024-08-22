package switchcase;

public class calculator {

	public static void main(String[] args) {
		char ops = '+' ;
        int num1=100, num2=500, res;
		switch (ops) {
		
		case '+':
		res=num1+num2;
		System.out.println("addition of 2 no. "+num1+num2);
		break ;
		default :
		System.out.println("invalid operation   ");
		break;
		}}}