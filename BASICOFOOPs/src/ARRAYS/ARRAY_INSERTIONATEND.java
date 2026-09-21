package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_INSERTIONATEND {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   int a[] = {20,21,40};
		   int k = 3;
		   int n = a.length;
		   int ans[] = new int[n+1];
		   
		   System.out.println(Arrays.toString(ans));
		   
		   for (int i = 0; i < n ; i++) {
			   ans[i] = a[i];
		   }
		   ans[n] = k;
		   System.out.println(Arrays.toString(ans));
		   sc.close();
	   }
}
