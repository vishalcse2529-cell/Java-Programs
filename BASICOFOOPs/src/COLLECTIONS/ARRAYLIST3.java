package COLLECTIONS;
import java.util.ArrayList;

public class ARRAYLIST3 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> TwoArray = new ArrayList<>();
		
		ArrayList<Integer> Row1 = new ArrayList<>();
		Row1.add(50);
		Row1.add(40);
		Row1.add(30);
		
		ArrayList<Integer> Row2 = new ArrayList<>();
		Row2.add(60);
		Row2.add(50);
		Row2.add(60);
		
		TwoArray.add(Row1);
		TwoArray.add(Row2);
		
		System.out.println(TwoArray);
	}
}

