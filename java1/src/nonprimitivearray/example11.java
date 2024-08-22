package nonprimitivearray;
class demo1{

int num1 ,num2;
demo1() {
 System.out.println(" i m zero param const");
} 
demo1 (int x){
 System.out.println(" i n int param const");
 num1=x;
 
}
demo1 (int x, int y){
 System.out.println("i m int int param const");
 num1= x;
 num2 = y;
}
void callingnumbers() {
 System.out.println("number are num1; "+num1 + " &  num2;  "+num2);
}
public class example11 {

	public static void main(String[] args) {
		//non primitive array of demo1 class type
		demo1[] ref = new demo1[3];
		ref[0]=new demo1();
		ref[1]=new demo1(25);
		ref[2]=new demo1(55,25); 
		
		ref[0].callingnumbers();
		ref[1].callingnumbers();
		ref[2].callingnumbers();
		
	}

}}
