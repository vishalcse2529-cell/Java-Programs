package BASICS;
import java.util.Scanner;

public class WHILELOOP3 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int n = sc.nextInt();
		int last = n % 10;
		
		while (n >= 10) {
			n = n / 10;
		}
		
		int first = n;
		System.out.println("First Digit : "+first);
		System.out.println("Last Digit : "+last);
		
		sc.close();
}
}

