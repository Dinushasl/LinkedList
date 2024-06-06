package Linkedlist;

public class LinkedList {

	    Node head;

	    // Node class
	    static class Node {
	        int data;
	        Node next;

	        // Constructor to create a new node
	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }

	    // Method to insert a new node at the end of the list
	    public void append(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }

	        last.next = newNode;
	    }

	    // Method to insert a new node at the front of the list
	    public void prepend(int data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }

	    // Method to delete a node by key
	    public void deleteByKey(int key) {
	        Node temp = head, prev = null;

	        // If the head node itself holds the key
	        if (temp != null && temp.data == key) {
	            head = temp.next; // Changed head
	            return;
	        }

	        // Search for the key to be deleted, keep track of the previous node
	        while (temp != null && temp.data != key) {
	            prev = temp;
	            temp = temp.next;
	        }

	        if (temp == null) return;

	        prev.next = temp.next;
	    }

	  
	    public void printList() {
	        Node currNode = head;

	        while (currNode != null) {
	            System.out.print(currNode.data + " ");
	            currNode = currNode.next;
	        }
	    }

	    public static void main(String[] args) {
	  
	        LinkedList list = new LinkedList();

	      
	        list.append(1);
	        list.append(2);
	        list.append(3);
	        list.append(4);
	        list.append(5);

	        
	        System.out.println("Linked list:");
	        list.printList();

	        
	        list.deleteByKey(3);

	      
	        System.out.println("\nLinked list after deletion of 3:");
	        list.printList();


	        list.prepend(0);

	        
	        System.out.println("\nLinked list after prepending 0:");
	        list.printList();
	    }
	}



