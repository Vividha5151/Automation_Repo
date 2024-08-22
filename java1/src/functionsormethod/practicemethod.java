package functionsormethod;

public class practicemethod {

public class MethodSyntax {
			/**
			 * Method type: static
			 * Access Modifier: default
			 * non-access Modifier: static
			 * return type: void
			 * method name: testMyCode
			 * argument: 
			 * return value: 
			 */
			static void testMyCode() {
				
				//return;// its completely optional, if you don't write it dn java compiler will write on behalf of you
			}
			/**
			 * Method type:nonstatic 
			 * Access Modifier: private
			 * non-access Modifier: non static
			 * return type: double
			 * method name: getSalary
			 * argument:  
			 * return value: 15.356
			 */
			private double getSalary() {
				System.out.println("");
				return 15.356;
			}
			/**
			 * Method type:non static
			 * Access Modifier: protected
			 * non-access Modifier: non static
			 * return type:int 
			 * method name: empId
			 * argument:  
			 * return value: void
			 */
			protected int empId() {
				int x=101;
				return x;
			}

			/**
			 * Method type: non static
			 * Access Modifier: public
			 * non-access Modifier: non static
			 * return type: void
			 * method name: deptNum
			 * argument:  int
			 * return value: void
			 */
			public void deptNum(int num) {

			}
			/**
			 * Method type: static
			 * Access Modifier: default
			 * non-access Modifier: static
			 * return type: void
			 * method name: deptNum2
			 * argument:  String
			 * return value: void
			 */
			static void deptNum2(String num) {
				
			}
			/**
			 * Method type: static
			 * Access Modifier: default
			 * non-access Modifier: static
			 * return type: void
			 * method name: deptNum3
			 * argument: int
			 * return value:void 
			 */
			static boolean deptNum3(int num) {
				boolean res=(num==15);
				return res;
			}

			/**
			 * Method type: non static
			 * Access Modifier: private
			 * non-access Modifier: non static
			 * return type: char
			 * method name: deptNum4
			 * argument:  boolean
			 * return value: char
			 */
			private char deptNum4(boolean b1) {
				return 'A';
			}

			/**
			 * Method type: non static
			 * Access Modifier: public
			 * non-access Modifier: non static
			 * return type: void
			 * method name: main
			 * argument:  string
			 * return value: void
			 */
			}
			// static global variables
			static int age;
			static double salary;	
			/**
			 * This is a static method with return type as int and no parameter in it
			 * Method type: static
			 * Access Modifier: public
			 * non-access Modifier: static
			 * return type: int
			 * method name: test1
			 * argument:  
			 * return value: 201201
			 */
			public static int test1() {
				System.out.println("I am test1 method.");
				//logic		
//				int pin=201201;
//				return pin;
				return 201201;
			}
			/**
			 * This is a static method with return type as void and having no parameter
			 * Method type: static
			 * Access Modifier: default
			 * non-access Modifier: static
			 * return type:void 
			 * method name: test2
			 * argument:  
			 * return value: I am test2 method
			 */
			static void test2() {
				System.out.println("I am test2 method");
				//return; this will be written by java compiler at compile
			}
			/**
			 * This is a static method with return type as double and having parameter as boolean
			 * Method type:static  
			 * Access Modifier: public  
			 * non-access Modifier:static  
			 * return type: double
			 * method name: test3
			 * argument: boolean 
			 * return value: d
			 */
			static public double test3(boolean b1) {
				System.out.println("");
				double d=15.36;
				return d;
			}
			
			/**
			 * This is a static private method with return type as void and having parameter as float
			 * Method type:non static 
			 * Access Modifier:private 
			 * non-access Modifier: non static
			 * return type: void
			 * method name: test4
			 * argument:  
			 * return value:  void
			 */
			private void test4(float f) {
				System.out.println("");
			}
			/**
			 * Method type:static  
			 * Access Modifier: public
			 * non-access Modifier: static 
			 * return type:  void
			 * method name: main
			 * argument:String  
			 * return value:  void
			 */
			static public void main(String[] args) 
			{
				

			}

		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
		
		
		
		
		
		
		
		
		
		/*
		Method or function both are same
		- it contains set of repetitive statements or reusable statements
		- it can be two types
				- static
				- non static
		- Syntax:
					modifier returntype methodname(args)
					{	
						.........;//statement1
						.........;//statement2
						.........;//statement3
						return value;
					}
			where: 
					modifier = accessmodifier + nonaccessmodifier;
						- accessmodifers --> define visibility of the class members
								* private
								* default
								* protected
								* public
						- non-accessmodifers ---> 
								* static/non-static
								* abstract 
								* native & etc
					returntype: define type of value method should return
								* datatype - primitive or non-primitive datatype
								* void (return value statement is optional) --> won't return any value to JVM
					methodname: valid identifier
					args: argument/parameter ---> optional ----> primitive or non-primitive datatype
					return value---> based on return type, value should be return from the method
		*/
		
		
		
		
		
		
		
		
		
	


