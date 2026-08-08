package BASICS;
import java.util.*;

public class SWITCHCASE2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a Day :");
	String d = sc.nextLine();
	
	switch (d) {
	
	case "sunday","saturday","Sunday","Saturday":
		System.out.println("Weekends");
	    break;
	default:
		System.out.println("Weekdays");
		break;	
	}
	sc.close();
}
}

