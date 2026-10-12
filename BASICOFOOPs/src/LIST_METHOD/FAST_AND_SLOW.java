package LIST_METHOD;
import java.util.*;

class Node1{
	int data;
	Node1 next;
	
	Node1(int data){
		this.data = data;
		this.next = null;
		}
	}
class md{
	  Node1 head;
	  void insert(int data) {
		  Node1 newNode = new Node1(data);
		  if(head == null) {
		    head = newNode;
		    return;
		  }
		  
		  Node1 temp = head;
		  while(temp.next != null)
			  temp = temp.next;
		  temp.next = newNode ;
	  }
	  void createCycle() {
		  head.next.next.next.next = head.next;
	  }
	  
	  boolean hasCycle() {
		  Node1 slow = head;
		  Node1 fast = head;
		  
		  while (fast != null && fast.next != null) {
			  slow = slow.next;
			  fast = fast.next.next;
			  
			  if(slow == fast)
				  return true;
			  
		  }
		  return false;
	  }
	
}
 public class FAST_AND_SLOW {
  public static void main (String[] args) {
	  md list = new md();
	  
	  list.insert(10);
	  list.insert(20);
	  list.insert(30);
	  list.insert(40);
	  list.insert(50);
	  
	  list.createCycle();
	  
	  if(list.hasCycle())
		 System.out.println("Cycle Detected");
	  else 
		  System.out.println("No Cycle Found");
  }
}
