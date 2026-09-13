package CLASSES_OBJECTS;
/* WITHOUT PARAMETER WITH RETURN*/

class demo3{
	String State() {
		return "Tamil Nadu";
	}
}
public class USER_DEFINED3 {
	public static void main(String[] args) {
		demo3 m = new demo3();
		String s = m.State();
		System.out.println(s);
	}
}
