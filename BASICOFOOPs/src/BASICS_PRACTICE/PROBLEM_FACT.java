package BASICS_PRACTICE;
import java.util.Scanner;

public class PROBLEM_FACT {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Number for Factorial : ");
	int n = sc.nextInt();
	int fact = 1;
	
	while (n > 0) {
		fact = n * fact;
		n--;
	}
	System.out.println("Answer : "+fact);
	sc.close();
}
}