package ARRAYS;
import java.util.*;
public class BASICS6 {
	public static void main(String[] args) {
		int[][] arr = {{10,20,30,40},
				       {50,40,30}};
		int total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total = total + arr[i][j];
			}
		}
		System.out.println(total);
	}

}
