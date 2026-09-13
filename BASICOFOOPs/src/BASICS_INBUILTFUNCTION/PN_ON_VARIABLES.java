package BASICS_INBUILTFUNCTION;
import java.util.*;
class CharCharacter{
	void Convert(char a) {
		System.out.println(Character.isUpperCase(a));
		System.out.println(Character.isLowerCase(a));
		System.out.println(Character.toUpperCase(a));
		System.out.println(Character.toLowerCase(a));
		System.out.println(Character.isDigit(a));
		System.out.println(Character.isSpaceChar(a));
		System.out.println(Character.isLetter(a));
	}
}

public class PN_ON_VARIABLES {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		CharCharacter ch = new CharCharacter();
		ch.Convert(a);
		sc.close();
	}
}
