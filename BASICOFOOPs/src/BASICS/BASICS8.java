package BASICS;

public class BASICS8 {
public static void main(String[] args) {
	
	int n1 = 1;
	int n2 = 10;
	int n3 = 9;
	
	if (n1 < n2) {
		if (n1 < n3) {
			System.out.println("N1 is Smallest");
		}else {
			System.out.println("N3 is Smallest");
		}
	}else {
		if (n2 < n3) {
		    System.out.println("N2 is smallest");
		}else {
			System.out.println("N3 is smallest");
		}
	}
}
}
