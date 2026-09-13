package CLASSES_OBJECTS;
/* WITH PARAMETER WITH RETURN*/

class demo{
	int max(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
}
public class USER_DEFINED {
	public static void main(String[] args) {
		demo m = new demo();
		int Result = m.max(3, 0);
		System.out.println("Ans : " + Result);
	}
}
