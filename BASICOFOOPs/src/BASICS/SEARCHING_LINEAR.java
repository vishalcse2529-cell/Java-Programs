package BASICS;
import java.util.*;

public class SEARCHING_LINEAR {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Size of Array :");
	int l = sc.nextInt();
	int[] arr = new int[l];
	for(int i = 0; i < l; i++) {
		arr[i] = sc.nextInt();
	}
	
	System.out.println("Enter the Number to Find");
	int target = sc.nextInt();
	sc.close();
	
	for (int i = 0; i < l; i++) {
		if (arr[i] == target) {
			System.out.println("Element found at the Index :"+i);
			return;
		}
	}
	System.out.println(-1);
	
	}
}
