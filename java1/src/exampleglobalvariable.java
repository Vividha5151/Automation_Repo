
public class exampleglobalvariable {
       //static global variable
	static int age=35;
    static double salary=50000;
    static boolean status;
    static byte status1;
    static char status2;
    static float num;
    
	public static void main(String[] args) {
		//standard method
		//classname.variablename
		System.out.println("SGV age= "+exampleglobalvariable.age);
		System.out.println("SGV salary= "+exampleglobalvariable.salary);
		System.out.println("status= "+exampleglobalvariable.status);
      
		//reinitialization
		 age =95;
		status=true;
		System.out.println("SGV age= "+age);
		System.out.println("SGV salary= "+salary);
		System.out.println("status= "+status);
		
		//direct method
		System.out.println("SGV status1= "+status1);
		System.out.println("SGV status1= "+status2);
		System.out.println("SGV num="+num);
	}
	}




//can b use directly or by standard method i.e classname.staticglobalvariablename
//changes can be made as it is single memory location old values get back and new values will given
//static global variable is not compulsary to write 
//  byte, int, short, long = 0;
 //   float,double =0.0;
 //   char= blank
 //   boolean= true false	
    
    
