package BASICS;
import java.util.*;
public class BALANCEUSEINGIF {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Bill Amount :");
	int bill_am = sc.nextInt();
	if (bill_am >= 50000) {
		System.out.println("20% Discount");
	}else if ((bill_am >= 10000) && (bill_am < 50000)){
		System.out.println("10% Discount");
	}else {
		System.out.println("No Discount");
	}
	sc.close();
}
}
