package systemclass;

public class Systemclass {

	public static void main(String[] args) {

		String currentWorkingDir = System.getProperty("user.dir");

		System.out.println("user.dir= "+currentWorkingDir);
		
		System.out.println(System.getProperty("user.home"));

		System.out.println(System.getProperty("java.home"));

		System.out.println(System.getProperty("user.name"));

		System.out.println(System.getProperty("os.name"));

		System.out.println(System.getProperty("os.version"));

		System.out.println(System.nanoTime());
		
		System.out.println(System.currentTimeMillis());

	}

}

