package ARRAYS;

public class PROBLEM5 {
	public static void main(String[] args) {
		int[][] arr = {{10,20,30,40},
				       {100,40,30,40}};
		
		for(int r = 0; r < arr.length; r++) {
			int Sum = 0;
		for(int i = 0; i < arr[r].length; i++) {
					Sum += arr[r][i];
				}
		System.out.println(Sum);
		}
	}
}

