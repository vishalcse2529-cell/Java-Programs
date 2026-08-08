package BASICS_PRACTICE;
import java.util.Scanner;

public class PROBLEM_OTP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int otp = (int)(Math.random() * 9000) + 1000;
        System.out.println("Generated OTP :"+ otp);

		int i = 0;
		while(i < 5) {
			System.out.println("Enter your OTP :");
		    int uotp = sc.nextInt();
		
		    if (otp == uotp) {
			  System.out.println("OTP Verified");
			  break;
		    }else {
			  System.out.println("OTP Not Verified, Please retry.");
		    }
		    i++;
		}
		if (i == 5) {
			System.out.println("Try Again Later");
			}
		sc.close();
}
}
