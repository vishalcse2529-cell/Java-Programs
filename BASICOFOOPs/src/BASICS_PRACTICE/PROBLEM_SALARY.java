package BASICS_PRACTICE;
import java.util.*;
public class PROBLEM_SALARY {
public static void main (String[]arg) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Basic Pay : ");
		Double  basic = sc.nextDouble();
		System.out.println("House Rent Allowance : ");
		Double  hra = sc.nextDouble();
		System.out.println("Dearness Allowance : ");
		Double  da = sc.nextDouble();
		System.out.println("Personal Fund : ");
		Double  ps = sc.nextDouble();
		
		Double  gs = basic + hra + da ;
		Double  net =gs - ps ;
		
        System.out.println("Gross Salary : "+gs);
		System.out.println("Net : "+net);
		sc.close();
	}
}