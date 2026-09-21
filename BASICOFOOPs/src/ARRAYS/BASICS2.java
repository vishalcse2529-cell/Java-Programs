package ARRAYS;
import java.util.*;

public class BASICS2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Matrix should be in same size : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[][] ab = new int[a][b];
		int[][] cd = new int[a][b];
		int[][] fg = new int[a][b];
		
		
		for(int i = 0; i < a ;i++) {
			for(int j = 0; j < b ; j++) {
				ab[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < a ;i++) {
			for(int j = 0; j < b ; j++) {
				cd[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				fg[i][j] = ab[i][j] * cd[i][j];
			}
		}
		System.out.println(Arrays.deepToString(fg));
		sc.close();
	}
}
