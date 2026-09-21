package ARRAYS;
import java.util.Scanner;
import java.util.Arrays;

public class BASICS {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50}; // Array initialize
	    int Total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			Total = Total + arr[i];
		}
		System.out.println(Total);
		
		Scanner sc = new Scanner(System.in);
		int[] arr2 = new int[5];
		for(int i = 0; i < arr2.length; i++) {
			int ui = sc.nextInt();
			arr2[i] = ui;
		}
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		for(int ar : arr2) {
			System.out.println(ar);
		}
		sc.close();
	}
}
