package BASICS;
import java.util.*;

public class FORLOOP3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number");
	int nn = sc.nextInt();
	
	int p = 0;
	int n = 0;
	int z = 0;
	
	for (int i = 1;i <= nn;i++) {
		System.out.println("Enter the Element " +i+ ":");
		int d = sc.nextInt();
		if(d == 0) {
			z++;
		}else if(d < 0) {
			n++;
		}else {
			p++;
		}
	}
	System.out.printf("%.6f\n", (double) p / nn);
	System.out.printf("%.6f\n", (double) n / nn);
	System.out.printf("%.6f\n", (double) z / nn);
	sc.close();
}
}
