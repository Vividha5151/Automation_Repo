package typecasting;

class fruit {
	void Shape () {
		System.out.println("fruits are round in shape");
	}
}
class Mango extends fruit {
	void taste () {
		System.out.println("Mango is sweet in taste");
	}
	void Shape () {
		System.out.println("fruits are round in shape");
	}

	
	public class nonprimitivecasting {


}
	public static void main(String[] args) {
		
		fruit obj=new  fruit();
		obj.Shape();
	}

}
