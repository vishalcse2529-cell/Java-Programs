package BASICS;
import java.util.*;
public class WHILELOOP {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the Initial Level :");
	int tank = sc.nextInt();
	
	while (tank <= 50) {
		System.out.println("Water Level "+tank);
		tank+=10;
	}
	System.out.println("Tank filled");
	sc.close();
}
}
