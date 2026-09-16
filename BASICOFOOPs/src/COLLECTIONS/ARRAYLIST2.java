package COLLECTIONS;
import java.util.Collections;
import java.util.ArrayList;

public class ARRAYLIST2 {
	public static void main(String[] args) {
		ArrayList<String> Names = new ArrayList<>();
		ArrayList<Integer> Nums = new ArrayList<>();
		
		Names.add("Vishal");
		Names.add("Raji");
		Names.add("Shiva");
		
		System.out.println(Names);
		
		Names.set(2, "Appan");
		
		System.out.println(Names);
		
		// indexOf(Value) - It is used to find the value's index value
		System.out.println(Names.indexOf("Vishal"));
		
		Nums.add(90);
		Nums.add(30);
		Nums.add(40);
		Nums.add(50);
		Nums.add(20);
		
		Collections.sort(Nums);
		System.out.println(Nums);
		
		Collections.sort(Nums, Collections.reverseOrder());
		System.out.println(Nums);
	}

}
