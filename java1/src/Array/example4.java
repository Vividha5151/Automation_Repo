package Array;

public class example4 {

	public static void main(String[] args) {
		int[] numbers = { 5,-7,8,9,10,-8,-41,50,100 };
		double sum = 0;
		double average;
		// access all elements using for each loop add each element in sum
		for (int number : numbers) {
			//sum = sum + number;//0+2=2+(-9)=-7
					//or
			sum +=  number; //===> sum = sum + number;
		}
		// get the total number of elements
		int arrayLength = numbers.length;
		// calculate the average convert the average from int to double
		average = sum / arrayLength;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);

	}

}
