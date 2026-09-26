package ARRAYS;

public class PROBLEM5 {
	public static void main(String[] args) {
		int[][] arr = {{10,20,30},
				       {100,40,30}};
		int Sum = 0;
			for(int j = 0; j < arr.length + 1; j++) {
				
					Sum += arr[0][j];
				}
		System.out.println(Sum);
}
}
