package overriddingandsuper;

class Maharastra {
	void famousFor() {
		System.out.println("Financial Capital of India");
	}
}
class Pune extends Maharastra{
	void famousFor() {
		System.out.println("Pune is known for IT");
	}
}
public class overriding {

	public static void main(String[] args) {
		
		Maharastra obj= new Maharastra();
		obj.famousFor();//Financial Capital of India
		
		Pune p1= new Pune();
		p1.famousFor();//Pune is known for IT
		
		
		Maharastra obj3=new Pune();
		obj3.famousFor();//overrided behavior of famousFor()
		
		
	}
}





