package systemclass;

 
 class Testing{
	void calling() {
		System.out.println("I am Testing class calling");
	}
}
public class  example1sys {

	static Testing ref=new Testing();//static reference variable ref
	
	public static void main(String[] args) {
//		Testing ref=new Testing();
//		ref.calling();
		
		 example1sys.display();
		
		 example1sys.ref.calling();
		//classname.staticrefVariableOfTestingClass.nonstaticMethodOfTestingClass
		
		System.out.println("Hello");
		//classname.staticrefVariableOfPrintStreamClass.nonstaticMethodOfPrintStreamClass
		
		System.err.println("I am error msg");
	}
	
	static void display() {
		System.out.println("I am display of SystemClassExample");
	}

}
