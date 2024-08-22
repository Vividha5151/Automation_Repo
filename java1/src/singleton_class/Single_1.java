package singleton_class;

class SingletonExample {
	private SingletonExample () {
		System.out.println("i am singleton class");
	}
	 private static SingletonExample ref =new SingletonExample();
	 private static SingletonExample getreference() {
		 return ref;
		 
	 }
}

public class Single_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
