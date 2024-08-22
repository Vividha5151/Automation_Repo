package stringBuffer;

public class sb_1 {

	public static void main(String[] args) {
       StringBuffer sb= new StringBuffer("Hi");
		System.out.println("Original "+sb);
		sb.append(" Vividha");//append = increase or add
		System.out.println(sb);
		sb.insert (2," I am");
		System.out.println(sb);
		 
		//if want remove 
		sb.replace(2,3," xxx");
	    System.out.println(sb);
	    //delete
	    
	    sb.delete(2,5);
	    System.out.println(sb);
	
	}
}
