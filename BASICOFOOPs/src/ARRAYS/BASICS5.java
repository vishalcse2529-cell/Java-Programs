package ARRAYS;
import java.util.*;

public class BASICS5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] arr_copy = new int[n];
		for(int i = 0; i < n; i++) {
			arr_copy[i] = arr[i];
		}
		for(int i = 0; i < n; i++) {
			System.out.println(arr_copy[i]);
		}
		sc.close();
	}

}
