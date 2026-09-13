package CLASSES_OBJECTS;
/* WITH PARAMETER WITHOUT RETURN*/

class demo2{
	void max(int a, int b) {
		if(a > b) {
			System.out.println("Ans : " + a);
		}else{
			System.out.println("Ans : " + b);
		}
	}
}
public class USER_DEFINED2 {
	public static void main(String[] args) {
		demo2 m = new demo2();
		m.max(3, 0);
	}
}
