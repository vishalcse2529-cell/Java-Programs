package BASICS;
import java.util.*;
public class BASICS5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char a = sc.next().charAt(0);
		if(a == 'a'||a == 'e'||a == 'i' ||a == 'o' ||a == 'u' ) {
			System.out.println("Vowel");
		}
		sc.close();
	}
}
