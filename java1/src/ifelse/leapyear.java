package ifelse;

public class leapyear {

	public static void main(String[] args) {
		int year =2024;
	   
		if(year%4==0 ){
	    	System.out.println("year is leap year   "+year);
	    }
	    else if (year%400==0 ){
	    	System.out.println("leap year  "+year);
	    }
	    else {
	    	System.out.println("not leap year");
	    }
	}

}
