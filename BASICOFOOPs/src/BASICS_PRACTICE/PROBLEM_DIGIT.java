package BASICS_PRACTICE;
import java.util.*;

public class PROBLEM_DIGIT {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Number : ");
	int num = sc.nextInt();
	int max = 0;
	
	while(num != 0) {
		int digit = num % 10;
		if (digit > max) {
		max = digit;
	}
		num /= 10;
	}
	System.out.println("Max : "+ max);
	sc.close();
}
}