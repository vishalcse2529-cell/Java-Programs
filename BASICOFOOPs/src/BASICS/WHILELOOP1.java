package BASICS;
import java.util.*;
public class WHILELOOP1 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
	
	int n = sc.nextInt();
	int a = 0;
	int b = 1;
	
	
	int i = 0;
	while(i < n) {
		System.out.println(a);
		
		int c = a + b;
		a = b;
		b = c;
		i++;
	}
	
sc.close();
}
}
