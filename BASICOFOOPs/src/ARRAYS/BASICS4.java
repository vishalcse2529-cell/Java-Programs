package ARRAYS;
import java.util.*;

public class BASICS4 {
	public static void main(String[] args) {
		int[] arr = {20,90,50,60};
		System.out.println(Arrays.toString(arr));
		
	    int[] arr_copy = Arrays.copyOf(arr, arr.length);
	    Arrays.sort(arr_copy);
	    System.out.println(Arrays.toString(arr_copy));
	}
}
