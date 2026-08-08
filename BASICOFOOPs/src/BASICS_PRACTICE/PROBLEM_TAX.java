package BASICS_PRACTICE;
import java.util.*;

public class PROBLEM_TAX {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double tax = 0;
	
	System.out.println("Enter your Anual Salary : ");
	double fs = sc.nextDouble();
	
	
	if (fs <= 1200000) {
		System.out.println("0% Tax");
		fs = fs - tax;
	}else if (fs > 1200000 && fs <= 1500000) {
		System.out.println("6% Tax");
		tax = 0.06*fs;
		fs = fs - tax;
		System.out.println("Your Tax Amout :"+tax);
		System.out.println("Final Amount :"+fs);
	}else {
		System.out.println("10% Tax");
		tax = 0.10*fs;
		fs = fs - tax;
		System.out.println("Your Tax Amout :"+tax);
		System.out.println("Final Amount :"+fs);
	}
	sc.close();
}
}
