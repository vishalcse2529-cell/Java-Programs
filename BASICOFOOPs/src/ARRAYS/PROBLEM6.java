package ARRAYS;
import java.util.*;

public class PROBLEM6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the Elements :");
		for(int i = 0; i < 2; i++) {
			int maxr = arr[i][0];
			for(int j = 0; j < 3; j++) {
				if(maxr < arr[i][j]) {
					maxr = arr[i][j];
				}
			}
			System.out.println("Row wise Max ["+i+"] : "+maxr);
		}
		
		for(int i = 0; i < 3; i++) {
			int maxr = arr[0][i];
			for(int j = 1; j < 2; j++) {
				if(maxr < arr[j][i]) {
					maxr = arr[j][i];
				}
			}
			System.out.println("Column wise Max ["+i+"] : "+maxr);
		}
	}

}
