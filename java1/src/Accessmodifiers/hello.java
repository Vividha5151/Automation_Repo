package Accessmodifiers;

public class hello {
	private int age = 50;

	void calling() {
		System.out.println("my number is 1234");
	}

	protected void singing() {
		System.out.println(" i m singing a song");
	}

	public void Dancing() {
		System.out.println(" i m dancing");
	}

	public static void main(String[] args) {

		hello v1 = new hello();
		System.out.println("age = " + v1.age);
		v1.calling();
	}

	class example {

		public static void main(String[] args) {
			hello v1 = new hello();
			System.out.println("age = " + v1.age);
			v1.calling();
		}
	}
}
