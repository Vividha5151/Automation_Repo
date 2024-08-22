package string_class;

public class s_2 {

	public static void main(String[] args) {
		String s1= "Pune";//create object as its value is unique
        System.out.println("s1=  "+s1);	
        String s2 = "Mumbai";//create object as its value is unique
        System.out.println("s2= "+s2);
        String s3= "Pune";//will not create object as its value is not unique. literal is already created duplicate not allowed.point to existing object
        System.out.println("s3= "+s3);
        
        //Comparison
        
        System.out.println("s1 compared s2 with equals method  = "+s1.equals(s2));//false
        System.out.println("s1 compared s3 with equals method  = "+s1.equals(s3));//true
        
        //equal operator 
        System.out.println("s1 compared s2 with '==' operator  = "+s1==s2);//address is different //false
        System.out.println("s1 compared s3 with '==' operator  = "+s1==s3);//false
        System.out.println("===================================================================================");
        
        String s4 = new String("Banglore");//2 objects
        String s5 = new String("Banglore");//1 object
        
        System.out.println("s4 compared s5 with equals method  = "+s4.equals(s5));
        System.out.println("s4 compared s5 with '==' operator  = "+s4==s5);
        
        String s6 = new String ("Pune");
        System.out.println("s6=  "+s6);
        System.out.println("s6 compared s1 with equals method  = "+s6.equals(s1));
        System.out.println("s6 compared s1 with '==' operator  = "+s6==s1);
	}

}
