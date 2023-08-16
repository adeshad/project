package linkedlist;

public class DoublyLinkedList {
	Node head;
    Node tail;
    int size;

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtMiddle(int data, int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            insertAtBeginning(data);
        } else if (position == size) {
            insertAtEnd(data);
        } else {
            Node current = head;
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void deleteAtEnd() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void deleteAtMiddle(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            deleteAtBeginning();
        } else if (position == size) {
            deleteAtEnd();
        } else {
            Node current = head;
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBeginning(1);
        list.insertAtEnd(3);
        list.insertAtMiddle(2, 2);
        list.display();
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtMiddle(1);
        list.display();
    }
}
