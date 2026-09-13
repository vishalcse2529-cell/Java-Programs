package LIST_ADT;
import java.util.*;
class Sll{
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
			}
		}
	Node head = null;
	
	void insert(int data) {
		
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
		}else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + "→");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	void search(int value) {
		Node temp = head;
		
		while(temp != null) {
			
			if( temp.data == value) {
				System.out.println(value + " Found");
				return;
			}
			temp = temp.next;
		}
	}
	void delete(int value) {
		
		Node temp = head;
		
		if (head == null) {
			System.out.println("Empty");
		}else if (head.data == value) {
		    head = head.next;
		    return;
		}else{	
			while(temp.next != null) {
				
				if(temp.next.data == value) {
					temp.next = temp.next.next;
					return;
				}
				temp = temp.next;
			}
		}
	}
}
public class LINKEDLIST_SL {
	public static  void main(String[] args) {
		
	Sll list = new Sll();
	
     list.insert(20);
     list.insert(30);
     list.insert(40);
     
     System.out.println("Linked List: ");
     list.display();
     list.search(30);
     list.delete(20);
     
     System.out.println("After Delete :");
     
     list.display();

}
}