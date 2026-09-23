package ARRAYS;
import java.util.*;

public class ROTATION_LEFT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of element :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Index to Reverse");
		int k = sc.nextInt();
		k = k % n;
		
		reverse(arr, 0, k - 1);
		reverse(arr, k, n- 1);
		reverse(arr, 0, n - 1);
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
	static void reverse(int[] arr, int Start, int End) {
		while(Start < End) {
			int temp = arr[Start];
			arr[Start] = arr[End];
			arr[End] = temp;
			Start++;
			End--;
		}
	}
}