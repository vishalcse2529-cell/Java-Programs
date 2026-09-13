package STRING_BASIC;
 // Default capacity of StringBuffer is 16
 
public class STRING_METHODS {
	public static void main(String[] arg) {
		StringBuffer sn = new StringBuffer();
		System.out.println(sn.capacity());
		
		StringBuffer sb = new StringBuffer("Hello");
		
		// append() - Adds text at the end
		sb.append("World"); System.out.println(sb);
		// insert() - Inserts text at a particular position
		sb.insert(5, " Java"); System.out.println(sb);
		// replace() - Replace a portion of the string
		sb.replace(5, 10, " Python"); System.out.println(sb);
		// delete() - Delete characters
		sb.delete(5,12); System.out.println(sb);
		// deleteCharAt() - Delete one character
		sb.deleteCharAt(5); System.out.println(sb);
		// reverse() - Reverses the string
		sb.reverse(); System.out.println(sb);
		// length() - Returns number of characters
		sb.length(); System.out.println(sb);
		// capacity() - Return current capacity
		System.out.println(sb.capacity());
		// CharAt() - Return the character at a position
		sb.charAt(6); System.out.println(sb);
		// setCharAt() - Change a character
		sb.setCharAt(6, 'o'); System.out.println(sb);
	}

}
