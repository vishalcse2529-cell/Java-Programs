package STRING_BASIC;
/*
 * A college initially create
 * Student: Arun
 * add - Name- at beginning
 * Change Arun to Kumar
 * add - |Department: ECE at end
 * Print the final message
 */
public class PROBLEM2 {
	public static void main(String[] args) {
		StringBuffer sh = new StringBuffer("Student: Arun");
		sh.insert(0, "Name-");
		sh.replace(14, 20, "Kumar");
		sh.append(" |Department: ECE");
		System.out.println(sh);
	}
}
