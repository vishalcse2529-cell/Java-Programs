package BASICS;
import java.util.*;

public class BASICS3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Year");
	int a = sc.nextInt();
	if ((a%4==0&&a%100!=0)||(a%400==0)) {
		System.out.println("This is leap year");
	}sc.close();
}
}
