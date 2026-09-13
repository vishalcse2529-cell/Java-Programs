package CLASSES_OBJECTS;

interface Transaction {          // Interface - It is used to define what to do not how to do.
    void ShowTransaction();
}

class AccountBank {
    private String Name;                   // These Date are Secured so that we used Private
    private long AccountNumber;
    private double Balance;
	
    AccountBank(String Name, long AccountNumber, double Balance){
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
    
    public Double GetBalance() {
        return Balance;
    }
    
    public void Deposit(double Amount) {
        Balance = Balance + Amount;
    }
    
    public void Withdraw(double Amount) throws Exception {
        if(Balance < Amount) {
            throw new Exception("Insufficient Balance");
        }
        Balance = Balance - Amount;
    }
    
    public String GetName() {
        return Name;
    }
    
    public long GetAccountNumber() {
        return AccountNumber;
    }
    
    public void Display() {
        System.out.println("Name               :" + Name);
        System.out.println("Account Number     :" + AccountNumber);
        System.out.println("Balance            :" + Balance);
    }
}

abstract class Payment {
    protected AccountBank Sender;
    protected AccountBank Receiver;
    protected double Amount;
	
    public Payment(AccountBank Sender, AccountBank Receiver, double Amount) {
        this.Sender = Sender;
        this.Receiver = Receiver;
        this.Amount = Amount;
    }
    
    abstract void ProcessPayment() throws Exception;
}

class UPIPayment extends Payment implements Transaction {
    private String upiId;
    
    UPIPayment(AccountBank Sender, AccountBank Receiver, double Amount, String UPI_Id) {
        super(Sender, Receiver, Amount);
        this.upiId = UPI_Id;
    }
	
    @Override 
    void ProcessPayment() throws Exception {
        if (Amount <= 0) {
            throw new Exception("Invalid Payment Amount");
        }
        Sender.Withdraw(Amount);
        Receiver.Deposit(Amount);
        System.out.println();
        System.out.println("Payment Successful");
    }
    
    @Override
    public void ShowTransaction() {
        System.out.println("\n----- TRANSACTION DETAILS -----");
        System.out.println("UPI ID         : " + upiId);
        System.out.println("Sender         : " + Sender.GetName());
        System.out.println("Receiver       : " + Receiver.GetName());
        System.out.println("Amount         : " + Amount);
    }
}

public class PROBLEM2 {
    public static void main(String[] args) {
        AccountBank Sender = new AccountBank("Vishal", 547628900, 23000);
        AccountBank Receiver = new AccountBank("Raji", 678911923, 43000);
		
        System.out.println("BEFORE PAYMENT :");
		
        Sender.Display();
        System.out.println();
        Receiver.Display();
		
        UPIPayment payment = new UPIPayment(Sender, Receiver, 5000, "vishal@upi");
        try {
            payment.ProcessPayment();
            payment.ShowTransaction();
        } catch (Exception e) {
            System.out.println("Payment Failed");
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("AFTER PAYMENT :");
        Sender.Display();
        System.out.println();
        Receiver.Display();
    }
}