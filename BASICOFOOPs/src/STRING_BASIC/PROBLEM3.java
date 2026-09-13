package STRING_BASIC;

interface Payment{
	void MakPayment();
}

class Product{
	private static String ProductName;
	private static double Price;
	private static int Stock;
	
	Product(String ProductName, double Price,int Stock){
		this.ProductName = ProductName;
		this.Price = Price;
		this.Stock = Stock;
	}
	
	public static String GetProductName() {
		return ProductName;
	}
	
	public static double GetPrice() {
		return Price;
	}
	
	public int GetStock() {
		return Stock;
	}
	
	public static void ReduceStock(int Quantity) throws Exception{
		if(Quantity > Stock) {
			throw new Exception("Product is out of Stock");
		}
		Stock = Stock - Quantity;
	}
	
	public void ProductDisplay() {
		
		System.out.println("Product Name : " + ProductName);
		System.out.println("Price        : " + Price);
		System.out.println("Stock        : " + Stock);
	}
}
class Customer{
	
	private static String Name;
	private static String Email;
	
	Customer(String Name, String Email){
		this.Name = Name;
		this.Email = Email;
	}
	
	public static String GetName() {
		return Name;
	}
	
	public String GetEmail() {
		return Email;
	}
	
	public void CustomerDisplay() {
		System.out.println("Customer      : "+ Name);
		System.out.println("Email     : "+ Email);
	}
}

abstract class Order{
	protected Customer Name;
	protected Product NameProduct;
	protected int Quantity;
	protected double TotalAmount;
	
	Order(Customer Name, Product NameProduct,int Quantity){
		this.Name = Name;
		this.NameProduct = NameProduct;
		this.Quantity = Quantity;
		this.TotalAmount = Product.GetPrice() * Quantity;
	}
	abstract void PlaceOrder() throws Exception;
}

class OnlineOrder extends Order implements Payment{
	private String PaymentMethod;
	public OnlineOrder(Customer Name, Product NameProduct,int Quantity, String PaymentMethod) {
		super(Name, NameProduct, Quantity);
		this.PaymentMethod = PaymentMethod;
	}
	@Override
	void PlaceOrder() throws Exception{
		if (Quantity <= 0) {
			throw new Exception("Invalid Input");
		}
		Product.ReduceStock(Quantity);
		System.out.println("\nOrder Place Successfully");
	}
	@Override
    public void MakPayment() {
		System.out.println("Payment Method       : "+ PaymentMethod);
		System.out.println("Payment Amount       : "+ TotalAmount);
		System.out.println("Payment Successfully");
	}
	public void DisplayOrder() {

        System.out.println("\n----- ORDER DETAILS -----");
        System.out.println("Customer : " + Customer.GetName());
        System.out.println("Product  : " + Product.GetProductName());
        System.out.println("Quantity : " + Quantity);
        System.out.println("Total    : " + TotalAmount);
    }
}
public class PROBLEM3 {
	public static void main(String[] args) throws Exception {
		Product p1 = new Product("SamSung 24+", 60000, 3);
		Customer c1 = new Customer("Vishal", "vishalcse@gmail.com");
		
		System.out.println("\n----- PRODUCT -----");
		p1.ProductDisplay();
		System.out.println();
		c1.CustomerDisplay();
		
		OnlineOrder o1 = new OnlineOrder(c1, p1, 2, "UPI");
		
		try {
			o1.PlaceOrder();
			o1.MakPayment();
			o1.DisplayOrder();
			
		} catch (Exception e) {
			System.out.println("Order Cancelled");
			System.out.println(e.getMessage());
		}
		System.out.println("\n----- AFTER ORDER -----");

        p1.ProductDisplay();
	}
}
