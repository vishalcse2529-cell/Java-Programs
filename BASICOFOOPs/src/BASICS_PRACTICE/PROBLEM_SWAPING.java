package BASICS_PRACTICE;
import java.util.*;

public class PROBLEM_SWAPING {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Num 1 : ");
	int n1 = sc.nextInt();
	System.out.println("Enter Num 2 : ");
	int n2 = sc.nextInt();
	
	System.out.println("Before Swaping : ");
	System.out.println(n1);
	System.out.println(n2);
	
	n1 = n1 + n2;
	n2 = n1 - n2;
	n1 = n1 - n2;
	
	System.out.println("After Swaping : ");
	System.out.println(n1);
	System.out.println(n2);
	sc.close();
}
}
