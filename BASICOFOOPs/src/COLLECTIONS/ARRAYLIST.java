package COLLECTIONS;
/* ArrayList Means it is a re-sizable/dynamic 
*array used to store multiple values.
*It allows to store duplicate values.
*/
import java.util.ArrayList;
// For using ArrayList in Java we need to import this particular package.
public class ARRAYLIST {
	public static void main(String[] args) {
		ArrayList <String>  Names = new ArrayList<>();
		
		// add() - This function is used to add the value in the Array list
		Names.add("Vishal");
		Names.add("Ram");
		Names.add("Raji");
		
		System.out.println(Names);
		
		// get() - This function is used to print the list value based on index
		System.out.println(Names.get(0));
		System.out.println(Names.get(2));
		
		// set() - It is used to update the exist value of the Array list with the help of index
		Names.set(1, "Ridhu");
		Names.set(0, "Pasameyy");
		
		System.out.println(Names);
		
		// remove() - It is used to remove the Value from the list
		// Two ways one by "Index" and "Value"		
		Names.remove(2);
		Names.remove("Pasameyy");
		
		System.out.println(Names);
		
		// size() - It is used to find the size of the array
		System.out.println(Names.size());
		
		// contains() - It is used to find the given value is in the array or not.
		System.out.println(Names.contains("Ridhu"));
		
		// isEmpty() - This function is used to find if the array is empty or not.
		System.out.println(Names.isEmpty());
		
		// clear() - It delete the values in the array.
		Names.clear();
		
		System.out.println(Names);
	}

}

/*
add()
add(index, value)

get()
set()

remove()
clear()

size()
isEmpty()

contains()
indexOf()
lastIndexOf()

Collections.sort()
Collections.reverseOrder()

 */
