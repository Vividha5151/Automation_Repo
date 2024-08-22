package overriddingandsuper;
 
class home{
	int rooms=4;
	void television() {
		System.out.println("we have subscription of ott");
	}
	void kitchen() {
       System.out.println("i have fridge");
       }

	
	
class livingroom extends home {
	 int rooms=5;
     void phone() {
    	 System.out.println("my number is 123456789");
     }
	 void kitchen() {
	       System.out.println("i have tea maker");
	 }
	 void furniture() {
	      System.out.println("i have sofa");
	      System.out.println("i have rooms "+rooms);
	      kitchen();
	      phone();
			//to access parent class member you can create instance of parent class and access its all non-static member
         
	      home h1=new home();
          System.out.println("home rooms"+h1.rooms);
          h1.kitchen();
          h1.television();
 } 
}


public class superkeyword {

	public static void main(String[] args) {
		 
		
	}
}
}