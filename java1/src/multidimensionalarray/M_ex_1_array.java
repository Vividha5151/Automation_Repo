package multidimensionalarray;

 class M_ex_1_array {

	public static void main(String[] args) {
		int [][] arr = new int [3][3];
		System.out.println("total rows in array: "+ arr.length);
		System.out.println("total coloumn in array: "+ arr[0].length);
		for (int i =0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.println(" "+arr[i][j]);
			}
			System.out.println(    );
		}
		System.out.println("************************");
		arr [0][0] = 1;
		arr [0][1] = 2;
		arr [0][2] = 3;
		arr [1][0] = 4;
		arr [1][1] = 5;
		arr [1][2] = 6;
		arr [2][0] = 7;
		arr [2][1] = 8;
		arr [2][2] = 9;
		
		for (int i =0; i < arr.length;i++) {
			for (int j=0; j< arr.length; j++) {
				System.out.println(arr[i][j]+"    ");
			}
			System.out.println();
		}
	}

}
