
public class homework {
     
	
	static float days= 5.5f;
	int lenght;
	double salary=100 ;
	
	
	
	public static void main(String[] args) {
			System.out.println("program starts");
		    System.out.println("days "+ homework.days);
			
			homework ref1= new homework();
			ref1.lenght=8;
			
			System.out.println("nsgv len = "+ref1.lenght);	
			System.out.println("nsgv salary = "+ref1.salary);
            
			System.out.println(" ");
			primenumber(0);
		
			
					}
	static void primenumber(int num) {
	int num1=4,ct=0;
	for (int i=1;i<=num1;i++) {
		if (num1 % i==0) {
			ct++;
		}
		if (ct==2) {
			System.out.println("given number is prime ");
		  }else 
			  System.out.println("not a prime number  ");
	}
	
	}
	}

