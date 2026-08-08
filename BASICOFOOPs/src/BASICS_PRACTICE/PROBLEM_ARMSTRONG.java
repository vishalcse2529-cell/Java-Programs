package BASICS_PRACTICE;
import java.util.Scanner;

public class PROBLEM_ARMSTRONG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		while (n != 0) {
			int rem = n % 10;
			count = count + (rem*rem*rem);
			n = n / 10;
		}
		System.out.println(count);
		sc.close();
}
}
