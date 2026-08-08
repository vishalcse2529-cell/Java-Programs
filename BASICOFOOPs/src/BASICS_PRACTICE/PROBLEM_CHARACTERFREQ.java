package BASICS_PRACTICE;
import java.util.*;

public class PROBLEM_CHARACTERFREQ {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a String :");
	String word = sc.nextLine();
	int n = word.length();
	
	for (int i = 0; i < n; i++) {
		int count = 0;
		for (int j = 0; j < n; j++) {
			if (word.charAt(i) == word.charAt(j)) {
				count++;
			}
		}
		
		System.out.println(word.charAt(i) +"="+ count);
		sc.close();
	}
}
}
