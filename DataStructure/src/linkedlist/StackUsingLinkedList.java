package linkedlist;

public class StackUsingLinkedList {
	 Node head;
	    int size;
	    int capacity;

	    class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public StackUsingLinkedList(int capacity) {
	        this.head = null;
	        this.size = 0;
	        this.capacity = capacity;
	    }

	    public void push(int data) {
	        if (size == capacity) {
	            System.out.println("Stack is full");
	            return;
	        }
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	        size++;
	    }

	    public int pop() {
	        if (head == null) {
	            System.out.println("Stack is empty");
	            return -1;
	        }
	        int data = head.data;
	        head = head.next;
	        size--;
	        return data;
	    }

	    public boolean isEmpty() {
	        return head == null;
	    }

	    public boolean isFull() {
	        return size == capacity;
	    }

	    public static void main(String[] args) {
	        StackUsingLinkedList stack = new StackUsingLinkedList(3);
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        stack.push(4);
	        System.out.println("Is stack full? " + stack.isFull());
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Popped element: " + stack.pop());
	        System.out.println("Is stack empty? " + stack.isEmpty());
	    }
	}
