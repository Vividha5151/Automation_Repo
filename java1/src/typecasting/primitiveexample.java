package typecasting;

public class primitiveexample {

	public static void main(String[] args) {
		calling(8520);
		System.out.println(call (10.0,10));

	}
 static void calling(int num) {
	 System.out.println("i m calling from  "+num);
 }
 
 static int call(double d, int num) {
 double res= d+ num;
  return (int)res;
  
}}
