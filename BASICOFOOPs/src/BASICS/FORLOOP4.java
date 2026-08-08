package BASICS;
import java.util.Scanner;

public class FORLOOP4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int nn = sc.nextInt();
		
		int e = 0;
		int od = 0;
		
		for (int i = 1;i <= nn;i++) {
			if (i % 2  == 0){
				e++;
			}else {
				od++;
			}
		}
		System.out.println("Even "+ e );
		System.out.println("Odd "+ od ); 
		sc.close();
	}
}
