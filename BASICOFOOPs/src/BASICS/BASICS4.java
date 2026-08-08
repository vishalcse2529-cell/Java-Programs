package BASICS;
import java.util.*;
public class BASICS4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		if((a%5==0) && (a%11==0)) {
			System.out.println("Div by 5 and 11");
		}
		sc.close();
	}
}
