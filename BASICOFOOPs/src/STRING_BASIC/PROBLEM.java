package STRING_BASIC;
/*
 * A college store a Student's name as:
 * "ArunKumar"
 * The Student wants to add "Mr." before the name.
 */
public class PROBLEM {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Arun Kumar");
		sb.insert(0, "Mr. ");
		System.out.println(sb);
	}
}
