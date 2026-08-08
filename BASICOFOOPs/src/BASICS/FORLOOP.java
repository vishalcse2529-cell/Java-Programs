package BASICS;
import java.util.*;
public class FORLOOP {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number Of Ticket");
	int n = sc.nextInt();
	
	for (int i = 1; i <= n; i++) {
		System.out.println("Printing the ticket No "+i);
	}
	System.out.println("All tickets are Entered");
	sc.close();
}
}
