package immutable_class;

final class Testing { // final as to make it immutable
	final String name;
	final double salary;

	Testing(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() { 
		return salary;
	}

	public class im11 {

		public static void main(String[] args) {
			Testing T1 = new Testing("Vividha", 100000.10);
			System.out.println(T1.getName());
			System.out.println(T1.getSalary());// can not change value as final keyword and if want have create new
												// object
			System.out.println("====================================");

			// new object if want change
			Testing T2 = new Testing("pune", 12.00);
			System.out.println(T1.getName());
			System.out.println(T1.getSalary());
		}

	}
}
