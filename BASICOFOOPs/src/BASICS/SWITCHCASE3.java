package BASICS;
import java.util.*;

public class SWITCHCASE3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Grade :");
	char a = sc.next().charAt(0);
	
	switch(a) {
	case 'a','A':
		System.out.println("Execllent");
	break;
	case 'b','B','c','C':
		System.out.println("Welldone");
	break;
	case 'd','D':
		System.out.println("Fail");
	break;
	default :
		System.out.println("Invalid");
	}sc.close();
}
}
