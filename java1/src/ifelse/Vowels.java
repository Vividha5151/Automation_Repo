package ifelse;

public class Vowels {

	public static void main(String[] args) {
		char ch='Z';
		if (ch=='A' || ch =='a') {
		System.out.println("given alphabet is vowel "+ch);	
		}
		else if(ch=='I' || ch=='i') {
			System.out.println("Given alphabet is vowel: "+ch);
		}
		else if (ch=='e'|| ch=='E') {
			System.out.println("GIVEN alphabet IS VOWEL"+ch);
		}
		else if(ch=='o' || ch=='O') {
			System.out.println("GIVEN alphabet IS VOWEL"+ch);
		}
		else if (ch=='U' || ch=='u'){
		System.out.println("GIVEN alphabet IS VOWEL"+ch);
		}else{
			System.out.println("it is a consonent  " +ch);
		}
	}

}


