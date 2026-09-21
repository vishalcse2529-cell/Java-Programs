package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_INSERTIONATPOS {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   int a[] = {20,21,40,50};
		   int k = 3;
		   int pos = 2;
		   int n = a.length;
		   int ans[] = new int[n+1];
		   
		   System.out.println(Arrays.toString(ans));
		   
		   for (int i = 0; i < pos ; i++) {
			   ans[i] = a[i];
		   }
		   ans[pos] = k;
		   
		   for (int i = pos; i < n; i++) {
			   ans[i+1] = a[i];
		   }
		   
		   System.out.println(Arrays.toString(ans));
		   sc.close();
	   }
}
