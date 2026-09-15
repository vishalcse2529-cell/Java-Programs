package COLLECTIONS;
import java.util.ArrayList;

public class ARRAYLOOP {
	public static void main(String[] args) {
		ArrayList <String>  Names = new ArrayList<>();
		
		Names.add("Vishal");
		Names.add("Ram");
		Names.add("Raji");
		
		for(String Name : Names) {
			System.out.println(Name);
		}
		
		System.out.println();
		
		for (int i = 0; i < Names.size(); i++) {
			System.out.println(Names.get(i));
		}
	}
}
