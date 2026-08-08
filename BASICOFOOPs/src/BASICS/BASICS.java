package BASICS;
import java.util.*;

public class BASICS {
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the salary");
	  int a = sc.nextInt();
	  if (a>50000) {
		  System.out.println("Your are eligible for bonus");
	  }
	  sc.close();
  }
}
