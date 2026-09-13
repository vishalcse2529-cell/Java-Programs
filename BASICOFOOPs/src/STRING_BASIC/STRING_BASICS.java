package STRING_BASIC;
/*
 * String is a collection of character which is immutable and also mutable
 */
public class STRING_BASICS {
	public static void main(String[] args) {
		String name = new String("Vishal");
		String name2 = new String("Harini");
		String name3 = new String("Harini Vishal");
		String name4 = new String(" Harini Vishal ");
		System.out.println(name);
		
		// length() - Gives the number of words
		System.out.println(name.length());
		// CharAt(input) - Give the character in the input index
		System.out.println(name.charAt(0));
		// toUpperCase() - Convert to UpperCase
		System.out.println(name.toUpperCase());
		// toLowerCase() - Convert to LowerCase
		System.out.println(name.toLowerCase());
		// equals() - It check whether the two string are same content or not
		System.out.println(name.equals(name2));
		// equalsignoreCase() - Check whether the content is same but it doesn't consider the Case sensitive
		System.out.println(name.equalsIgnoreCase(name2));
		// contains() - Whether the string contain a particular part of the given values
		System.out.println(name2.contains(name3));
		// startsWith() - It check whether the string is starting with the given word or not
		System.out.println(name3.startsWith("Harini"));
		// endsWith() - It check whether the string is ends with the given word or not
		System.out.println(name3.endsWith("Vishal"));
		// substring() - Used to extract the portion of that particular string
		System.out.println(name3.substring(6));
		// indexOf() - It find and return the given word index
		System.out.println(name3.indexOf("Vishal"));
		// lastIndexOf() - It return the last occurrence Index
		System.out.println(name3.lastIndexOf("l"));
		// replace() - Replace the exist word with new one
		System.out.println(name3.replace("Harini", "Ridhu"));
		// trim() - Used to remove the unwanted whitespace from the string
		System.out.println(name4.trim());
		// concat() - Used to join two string
		System.out.println(name.concat(name2));
		// isEmpty() - Check whether the string is empty or not
		System.out.println(name.isEmpty());
		// isBlank() - Check whether the string is Blank or not
		System.out.println(name.isBlank());
	}
}
