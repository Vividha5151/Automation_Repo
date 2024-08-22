package overriddingandsuper;

class car{
	void color() {
		System.out.println("color is white");
	}
	void seat() {
		System.out.println("my seat cover is black");
	}
}

class bike{
	void color() {
		System.out.println("color is white");
	}
	void seat() {
		System.out.println("my seat cover is black");
	}
	void sound() {
		System.out.println("my sound is good");
	}
}

public class mahindra {

	public static void main(String[] args) {
		car ref= new car();
		ref.color();//color is white
		ref.seat ();//my seat cover is black
          bike b1=new bike();
          b1.color();//color is white
          b1.seat();//my seat cover is black
          b1.sound();//my sound is good
	}

}
