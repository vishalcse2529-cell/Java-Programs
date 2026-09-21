package LIST_METHOD;
import java.util.*;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
		}
	}
class Sll{

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
		System.out.println("Node Inserted Successfully");
	}
	
	void display() {
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		
		Node temp = head;
		System.out.println("Linked List: ");
		
		while(temp != null) {
			System.out.print(temp.data + "→");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	void search(int value) {
		Node temp = head;
		int position = 1;
		while(temp != null) {
			if( temp.data == value) {
				System.out.println("Element Found at Position: "+position);
				return;
			}
			temp = temp.next;
			position++;
		}
		System.out.println("Element Not found");
	}
	void delete(int value) {
		
		if (head == null) {
			System.out.println("Empty");
			return;
		}
		if (head.data == value) {
		    head = head.next;
		    System.out.println("Node deleted Successfully");
		    return;
		}
		
		Node temp = head;
		Node prev = null;
		while(temp.next != null && temp.data != value) {
				prev = temp;
				temp = temp.next;}
		
		prev.next = temp.next;
		System.out.println("Node deleted Successfully");
}
public class SINGLY_LINKED {
	public static  void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Sll list = new Sll();
	    
	    int choice;
	    int value;
	    
	 do { 
	    System.out.println("1 - Insert");
	   	System.out.println("2 - Delete");
	   	System.out.println("3 - Search");
	   	System.out.println("4 - Display");
	   	System.out.println("5 - Exit");
	    	
    	choice = scanner.nextInt();
	    
    	switch (choice) {
    	case 1 :
    		System.out.println("Enter Element");
    		value = scanner.nextInt();
    		list.insert(value);
    		break;
    	case 2 :
    		System.out.println("Enter Element Delete");
    		value = scanner.nextInt();
    		list.delete(value);
    		break;
    	case 3 :
    		System.out.println("Enter Element Search");
    		value = scanner.nextInt();
    		list.search(value);
    		break;
    	case 4 :
    		list.display();
    		break;
    	case 5 :
    		System.out.println("Exit");
    		break;
    	default :
    		System.out.println("Invalid Choice");
       }
	   }while(choice != 5);
	    scanner.close();
}}}