package LIST_METHOD;
import java.util.*;

class StackArray{
	int stack[] = new int[5];
	int top = -1;

	void push(int data) {
		if(top == stack.length-1) {
			System.out.println("Stack Overflow");
			return;
		}
		stack[++top] = data;
	}
	void pop() {
		if(top == -1) {
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println("Poped Element : "+ stack[top--]);
	}
	 
	void peek() {
		if(top == -1) 
			System.out.println("Stack is Empty");
		else 
			System.out.println("Top Element : " + stack[top]);
		
		
	}
	void display() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.print("Stack Element : ");
		for (int i = top; i >= 0; i--) 
			System.out.println(stack[i] + " ");
		System.out.println();	
		
	
	}	
}
public class SINGLY_LISTED_STACK {
public static void main(String[] args) {
	StackArray s = new StackArray();
	s.push(10);
	s.push(20);
	s.push(30);
	
	s.display();
	s.peek();
	s.pop();
	s.display();
}
}
