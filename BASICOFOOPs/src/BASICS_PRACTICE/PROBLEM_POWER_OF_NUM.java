package BASICS_PRACTICE;
import java.util.*;

public class PROBLEM_POWER_OF_NUM {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int base = sc.nextInt();
	int exponent = sc.nextInt();
	
	int i = 1;
	int power = 1;
	
	while(i <= exponent) {
		power = power * base;
		i++;
	}
	System.out.println("Answer : "+power);
	sc.close();
}
}
