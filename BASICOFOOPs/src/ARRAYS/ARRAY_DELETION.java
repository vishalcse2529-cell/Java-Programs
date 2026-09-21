package ARRAYS;
import java.util.*;

public class ARRAY_DELETION {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] arr = {10,20,30,40,50};
	System.out.println("Enter the Position to Delete Element :");
	int n = arr.length;
	int pos = sc.nextInt();
	
	for (int i = pos; i < n - 1;i++) {
		arr[i] = arr[i+1];
	}
	n--;
	System.out.println("Array after Deletion");
	for (int i = 0; i < n; i++) {
		System.out.print(arr[i]+" ");
	}
	sc.close();
	}
}
