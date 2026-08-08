package BASICS;

public class BASICS6 {
	public static void main(String[] args) {
		int a[] = {12,20,30,40};
		int len = a.length;
		int min = a[0];
		int max = a[0];
		int sum = 0;
		for(int i=1;i<len;i++) {
		  if(a[i]<min) {
			  min = a[i];
		  }  
	 }
		System.out.println("Minimum "+min);
		
		for(int i=1;i<len;i++) {
			  if(a[i]>max) {
				  max = a[i];
			  }  
		 }
		System.out.println("Maximum "+max);
		
		for(int i=0;i<len;i++) {
			sum+=a[i];
		}
		System.out.println("Sum "+sum);
   }
}
