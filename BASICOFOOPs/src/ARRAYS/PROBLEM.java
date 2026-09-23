package ARRAYS;
import java.util.*;

public class PROBLEM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] arr = new double[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}
		
		double total = 0;
		for(int i = 0; i < n; i++) {
			total = arr[i] + total;
		}
		
		double avg = total/n;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
		    if(arr[i] > avg) {
		    	count++;
		    }
		}
		System.out.println(count);
	}
}
