package ARRAYS;
import java.util.*;

public class PROBLEM3 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int first = arr[0];
		int second = arr[0];
		
		for(int i = 0; i < n; i++) {
			if(arr[i] < first) {
				second = first;
				first = arr[i];
			}
		}
		System.out.println(second);
	}

}
