package STRING_BASIC;
/* StringBuffer is a class in java used to modify strings. Unlike String a, 
 StringBuffer object is mutable which means its contents can be changed without creating a new
 object every time.
 */
public class STRING_BUFFER {
public static void main(String[] args) {
	StringBuffer s = new StringBuffer("hellow");
	System.out.println(s);
}
}