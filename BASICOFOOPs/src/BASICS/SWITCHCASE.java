package BASICS;
import java.util.*;
public class SWITCHCASE {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Signal [r,t,y]");
	char s = sc.next().charAt(0);
	
	switch (s) {
	
	case 'R','r':
		System.out.println("Stop");
	    break;
	case 'T','t':
		System.out.println("Ready");
	    break;
	case 'Y','y':
		System.out.println("Go");
	    break;
	default:
		System.out.println("Invalid Signal");
		break;	
	}
	sc.close();
}
}
