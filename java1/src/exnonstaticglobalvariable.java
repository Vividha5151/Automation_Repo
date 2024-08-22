
public class exnonstaticglobalvariable {
	int age;
	double salary;
	boolean status;
	char grade;

	public static void main(String[] args) {
		//object making
		//ref=exnonstaticglobalvariable ;
		//exnonstaticglobalvariable.ref;

		exnonstaticglobalvariable r1=new exnonstaticglobalvariable();
		
		System.out.println("NSGV age= "+r1.age);
		System.out.println("NSGV salary= "+r1.salary);
		System.out.println("NSGV status= "+r1.status);
		 // reinitilisation
		r1.age=55;
		r1.salary=5500;
		
		System.out.println("NSGV age= "+r1.age);
		System.out.println("NSGV salary= "+r1.salary);
		
		
		exnonstaticglobalvariable r2=new exnonstaticglobalvariable();
		
		System.out.println("NSGV age= "+r2.age);
		System.out.println("NSGV salary= "+r2.salary);
		System.out.println("NSGV status= "+r2.status);
		
	
		
		
	}

}
