package linkedlist;

public class CircularQueue {

	    private int[] queue;
	    private int front;
	    private int rear;
	    private int size;
	    private int count;

	    public CircularQueue(int size) {
	        this.size = size;
	        queue = new int[size];
	        front = 0;
	        rear = -1;
	        count = 0;
	    }

	    public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue item: " + item);
	            return;
	        }
	        rear = (rear + 1) % size;
	        queue[rear] = item;
	        count++;
	        System.out.println("Enqueued item: " + item);
	 }

	    public void dequeue() {
	        if(isEmpty()) {
	            System.out.println("Queue empty. Cannot dequeue item.");
	            return;       }
	        int item = queue[front];
	        front = (front + 1) % size;
	        count--;
	        System.out.println("Dequeued item: " + item);
	    }
	    
	    public void displayQueue() {
	        if (isEmpty()) {
	            System.out.println("Circular Queue is empty.");
	            return;
	     }
	        
	        int i = front;
	     System.out.print("Elements in Circular Queue are: ");
	        
	        if (rear >= front) {
	            while (i <= rear) {
	                System.out.print(queue[i] + " ");
	                i++;
	            }
	        } else {
	            while (i < size) {
	                System.out.print(queue[i] + " ");
	                i++;
	            }
	            
	            i = 0;
	            while (i <= rear) {
	                System.out.print(queue[i] + " ");
	                i++;
	            }
	        }
	        
	        
	    }


	 public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. No item peek.");
	            return -1;
	        }
	        return queue[front];
	    }

	    public boolean isEmpty() {
	        return count == 0;
	    }

	 public boolean isFull() {
	        return count == size;
	    }

	    public int size() {
	        return count;
	    }

	    public static void main(String[] args) {
	        CircularQueue queue = new CircularQueue(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);

	        System.out.println("Front item: " + queue.peek());
	        System.out.println("Queue size: " + queue.size());

	        queue.dequeue();
	        queue.dequeue();

	        System.out.println("Front item after dequeue: " + queue.peek());
	        System.out.println("Queue size after dequeue: " + queue.size());

	        queue.enqueue(60);
	        queue.enqueue(70);

	        System.out.println("Front item after enqueue: " + queue.peek());
	        System.out.println("Queue size after enqueue: " + queue.size());
	        queue.displayQueue();
	    }
	   
	}


