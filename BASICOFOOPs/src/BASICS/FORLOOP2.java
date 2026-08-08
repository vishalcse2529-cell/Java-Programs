package BASICS;
import java.util.*;

public class FORLOOP2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of Product :");
	int n = sc.nextInt();
	
	for (int i = 1; i <=n ; i++) {
		System.out.println( "Your " + i +" Product has packed");
	}
	sc.close(); 
}
}
