package BASICS;
import java.util.*;

public class BANKACCOUNT {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Account Balance :");
	int acc_bal = sc.nextInt();
	if (acc_bal >= 100000) {
		System.out.println("Premium Account");
		System.out.println("Withdraw Allowed");
	}else if ((acc_bal >= 1000) && (acc_bal < 100000)){
		System.out.println("Standard Account");
		System.out.println("Withdraw Allowed");
	}else {
		System.out.println("Withdraw Not Allowed");
	}
	sc.close();
}
}
