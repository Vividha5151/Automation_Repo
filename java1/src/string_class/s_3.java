package string_class;

public class s_3 {

	public static void main(String[] args) {
		String s1= "HelloWorld";
		System.out.println("s1 =  "+s1);
		System.out.println("Characters count in given string=  "+s1.length());
		System.out.println("================================================");
        System.out.println("Character at index 4 = "+s1.charAt(5));
        System.out.println("Charcater at index no.8 =  "+s1.charAt(8));
        System.out.println("=========================================");
        //loop for index character
        for (int i=0; i<s1.length();i++) {            
        	System.out.println("Character at index " +i+"= "+s1.charAt(i));	
        }
        //loop for string reverse
        for (int i=s1.length()-1;i>=0;i--) {
        	System.out.println(s1.charAt(i));
        }
        
        System.out.println("lower case =  "+s1.toLowerCase());
        System.out.println("upper case =  "+s1.toUpperCase());
        System.out.println("======================================");
        System.out.println(s1.indexOf('W'));
        System.out.println(s1.lastIndexOf('l'));
        System.out.println("============================================");
	
	String s2= "    Good evening everyone Hi I am vividha   ";
	System.out.println(" s2 value is : \n "+s2);
	System.out.println("Remove Additional pre and post spaces - \n "+s2.trim());
	System.out.println("characters= "+s2.length());
	
	System.out.println(" \"Mr.kk\"");//double quotes
	
	
	}

}
