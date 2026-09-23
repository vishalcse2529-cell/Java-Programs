package ARRAYS;
import java.util.*;

public class PROBLEM2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int Even = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] % 2 == 0) {
				Even = Even + arr[i];
			}
		}
		System.out.println(Even);
	}

}
