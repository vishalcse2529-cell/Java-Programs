package BASICS;
import java.util.*;

public class BANKBALANCE {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Account Name holder:");
	   String name = sc.next();
	   System.out.println(name);
	   System.out.println("Account Number:");
       int accno=sc.nextInt();
	   System.out.println(accno);
	   int bal = 50000;
	   System.out.println("Balance "+bal);
	   System.out.println("Amount ");
       int amount_dep=sc.nextInt();
       System.out.println("Deposit : 1 ; Withdraw : 2");
       int choice=sc.nextInt();
	   switch(choice) {
	   case 1:
		   bal=bal+amount_dep;
		   System.out.println("Deposit "+bal);
		   break;
	   case 2 :
		   bal=bal-amount_dep;
		   System.out.println("withdrawl "+bal);
	   }
	   sc.close();
   }
}
