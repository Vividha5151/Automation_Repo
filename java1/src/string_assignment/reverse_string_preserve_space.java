package string_assignment;

public class reverse_string_preserve_space {

	public static void main(String[] args) {
		String st = "Hi, My name is Vividha";
	      String strArray[] = st.split(" ");
	      StringBuffer sb= new StringBuffer(st);
	      sb.reverse();
	      for(int i=0 ; i<st.length(); i++){
	      if(st.charAt(i)== ' '){
	         sb.insert(i, " ");
	      }
	   }
	   sb.append("");
	   System.out.println(sb);
	}

}