package CLASSES_OBJECTS;
/* Digital Payment Platform
 * Key Component :
 * Receiver and Sender
 * Account Balance, Amount withdraw, After balance
 */
class Account {
    String name;
	double balance;
	long accout_num;
	
    Account(String name,double  balance) {
		this.balance = balance;
		this.name = name;
	}
    class Payment{                                               // Inheritance
    void send(double payment) {
    	if(balance < payment) {
    		System.out.println("Insufficient Balance");
    	}else {
    		balance = balance - payment;
    	}
    }
    }
    class Receive extends Payment {
    	void receive(double payment) {
    		balance = balance + payment;}
    }
    
    void display() {
    	System.out.println("Name : " + name);
    	System.out.println("Balance : "+ balance);
    }
}
public class PROBLEM {
	public static void main(String[] args) {
		Account a1 = new Account("Vishal", 23990);
		Account.Payment a2 = a1.new Payment();
		Account.Receive a3 = a1.new Receive();
		a2.send(20000);
		a1.display();
		a3.receive(2560);
		a1.display();
	}

}
