package CLASSES_OBJECTS;
import java.util.*;

class Result{
	int m1,m2,m3,avg;
	 void setMark() {
		Scanner sc = new Scanner(System.in);
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		sc.close();
	}
	void cal_average() {
		avg = (m1+m2+m3)/3;
		System.out.println(avg);
		if (avg >= 50) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
public class BASICS2 {
public static void main(String[] args) {
       Result r1 = new Result();
       r1.setMark();
       r1.cal_average();
}
}
