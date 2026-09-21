package ARRAYS;
import java.util.*;

public class ARRAY_INSERTIONATBIG {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int a[] = {20,21,40};
	   int k = 3;
	   int pos = sc.nextInt();
	   int n = a.length;
	   int ans[] = new int[n+1];
	   
	   System.out.println(Arrays.toString(ans));
	   ans[pos] = k;
	   for (int i = 0; i < n ; i++) {
		   ans[i+1] = a[i];
	   }
	   System.out.println(Arrays.toString(ans));
	   sc.close();
   }
}
