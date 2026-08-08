package BASICS;
import java.util.*;

public class WHILELOOP2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	
	int n = sc.nextInt();
    
    int count = 0;
    
    while (n > 0) {
    	count++;
    	n = n / 10;
    }
    System.out.println("Number of digit in Number "+count);
    sc.close();
}
}
