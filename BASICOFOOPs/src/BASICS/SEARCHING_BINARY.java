package BASICS;
import java.util.*;

public class SEARCHING_BINARY {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Number of Element : ");
	int n=sc.nextInt();
	int arr[]= new int[n];
	
	System.out.print("Enter the Element : ");
	for(int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
	}
	/*if the array is unsorted mean we need to use the following method
	 * Array.Sort(arr);
	 * System.out.println(Array.toString(arr);
	 */
	
	System.out.print("Enter the Number to be Found : ");
	int key = sc.nextInt();
	int low = 0;
	int high = n - 1;
	
	sc.close();
	
	while(low <= high) {
		int mid = (low + high)/2;
		if(arr[mid] == key) {
			System.out.println("The Element found at "+mid);	
			return;
		}else if(arr[mid] > key) {
			high = mid - 1;
		}else {
			low = mid + 1;
		}
	}
	System.out.println(-1);
	}	
}