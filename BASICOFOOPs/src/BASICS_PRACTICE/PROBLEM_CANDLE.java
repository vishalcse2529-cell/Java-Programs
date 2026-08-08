package BASICS_PRACTICE;
import java.util.*;

public class PROBLEM_CANDLE {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter How many Candles");
	int n = sc.nextInt();
	int count = 0;
	int max = 0;
	
	System.out.println("Enter the hight of the Candle : ");
	
	for (int i = 0; i < n; i++) {
		
		int c = sc.nextInt();
		
		if (c > max) {
			max = c; 
			count = 1;
		}else if (max == c) {
			count++;
		}
	}
	System.out.println("Maximum Candle to be blow : "+count);
	sc.close();
}
}
