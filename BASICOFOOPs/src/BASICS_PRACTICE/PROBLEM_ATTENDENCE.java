package BASICS_PRACTICE;
import java.util.*;

public class PROBLEM_ATTENDENCE {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int emp_id[] = new int[n];
	sc.nextLine();

	for (int i = 0; i < n; i++) {
		emp_id[i] = sc.nextInt();
	}
	int target = sc.nextInt();
	sc.close();
	
	for (int i = 0; i < n; i++) {
		if(emp_id[i] == target) {
			System.out.println("Found At Index "+i);
			return;
		}
	}
	System.out.println(-1);
}
}
