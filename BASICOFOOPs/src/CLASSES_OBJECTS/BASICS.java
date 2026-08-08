package CLASSES_OBJECTS;

class Hospital{
	String H_name;
	String H_city;
	void display() {
		System.out.println(H_name);
		System.out.println(H_city);
	}
}
public class BASICS {
	public static void main(String[] args) {
		Hospital h1 = new Hospital();
		h1.H_name = "Vijay Hospital";
		h1.H_city = "Karur";
		h1.display();
	}
}  
