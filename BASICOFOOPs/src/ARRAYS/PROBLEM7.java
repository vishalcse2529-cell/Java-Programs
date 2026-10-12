package ARRAYS;
import java.util.*;
public class PROBLEM7 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		Stack<Integer> c = new Stack<Integer>();
		c.push(10);
		c.push(20);
		c.push(30);
		c.push(40);
		c.push(50);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.size());
		System.out.println(s.search(20));
		System.out.println(s.contains(50));
		System.out.println(s.get(1));
		s.set(0,100);
		System.out.println(s);
		System.out.println(s.firstElement());
		System.out.println(s.lastElement());
		// s.clear();
		System.out.println(s.isEmpty());
		System.out.println(s.indexOf(20));
		System.out.println(s.equals(c));
	}
}
