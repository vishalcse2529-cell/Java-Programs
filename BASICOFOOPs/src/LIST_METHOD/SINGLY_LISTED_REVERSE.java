package LIST_METHOD;
import java.util.*;

public class SINGLY_LISTED_REVERSE {
 Node headNode;

 void insert(int data) {
	 Node newNode = new Node(data);
	 if(headNode == null) {
		 headNode = newNode ;
		 return;
	 }
	  Node tempNode = headNode;
	  while (tempNode.next != null)
		  tempNode = tempNode.next;
	  tempNode.next = newNode;
 }
 
 void reverse() {
	 Node prevNode = null;
	 Node currentNode = headNode;
	 Node nextNode = null;
	 
	 while(currentNode != null) {
		 nextNode = currentNode.next;
		 currentNode.next = prevNode;
		 prevNode = currentNode;
	 }
	 
	 headNode = prevNode;
 }
 void display() {
	 Node tempNode = headNode;
	 while(tempNode != null) {
		 System.out.print(tempNode.data+" ");
		 tempNode = tempNode.next;
	 }
	 System.out.println();
 }
 
 public static void main(String[] args) {
	 SINGLY_LISTED_REVERSE list = new SINGLY_LISTED_REVERSE();
	 
	 list.insert(10);
	 list.insert(20);
	 list.insert(30);
	 list.insert(40);
	 
	 System.out.println("Original List : ");
	 list.display();
	 list.reverse();
	 
	 System.out.println("Reverse List : ");
	 list.display();
 }
}
