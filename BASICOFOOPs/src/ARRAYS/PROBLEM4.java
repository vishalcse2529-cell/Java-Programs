package ARRAYS;

public class PROBLEM4 {
	public static void main(String[] args) {
		int[][] arr = {{10,20,30},
				       {100,40,30}};
		int Max = arr[0][0];

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > Max) {
					Max = arr[i][j];
				}
			}
		}
		System.out.println(Max);
	}
	
}
