package LIST_METHOD;
import java.util.*;

public class SINGLY_LISTED_MERGE {
 static Node merge(Node list1, Node list2) {
	 Node dummyNode = new Node(0);
	 Node tailNode = dummyNode;
	 
	 while(list1 != null && list2 != null) {
		 if (list1.data <= list2.data) {
			 tailNode.next = list1;
			 list1 = list1.next;
		 }
		 else {
			 tailNode.next = list2;
			 list2 = list2.next;
		 }
		 tailNode = tailNode.next;
	 }
	 
	 if(list1 != null)
		 tailNode.next = list1;
	 
	 if(list2 != null)
		 tailNode.next = list2;
	 
	 return dummyNode.next;
 }
 
 static void display(Node headNode) {
	 while (headNode != null) {
		 System.out.print(headNode.data +" ");
		 headNode = headNode.next;
	 }
	 System.out.println();
 }
 public static void main(String[] args) {
	 Node list1 = new Node(10);
	 list1.next = new Node(30);
	 list1.next.next = new Node(50);
	 
	 Node list2 = new Node(20);
	 list2.next = new Node(40);
	 list2.next.next = new Node(60);
	 
	 Node mergeNode = merge(list1, list2);
	 
	 System.out.println("Merge Sorted List : ");
	 display(mergeNode);
 }
}
