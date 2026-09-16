package COLLECTIONS;
import java.util.ArrayList;

public class ARRAYINTEGER {
	public static void main(String[] args) {
		ArrayList<Integer> Num= new ArrayList<>();
		
		Num.add(90);
		Num.add(40);
		Num.add(70);
		
		int Total = 0;
		for(Integer num : Num) {
			Total = Total + num;
		}
		Num.remove(0);
		System.out.println(Num.size());
		System.out.println("Total = " + Total);
	}

}
