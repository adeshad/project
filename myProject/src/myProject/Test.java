// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package myProject;
class doublylist{
    static class Node
    {
        int data;
        Node next;
        Node previous;
        public Node(int val)
        {
            this.data=val;
            this.next=null;
            this.previous=null;
        }
    }
    
    Node head;
    public doublylist()
    {
        this.head=null;
    }
    
    public void add(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else if(head.data >=newNode.data)
        {
            /*
             newNode next is equal to head 
             newNode get assign to head previous
            newNode it self ad head (head=NewNode)
           
            */
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
           
        }
        else{
            Node trav=head;
            while(trav.next!=null && trav.next.data <= newNode.data)
            {
                trav=trav.next;
            }
            newNode.next=trav.next;
            newNode.previous=head;
            if(trav.next!=null)
            {
                trav.next.previous=newNode;
            }
            
            trav.next=newNode;
            
            
        }
    }
    
    
    public void show()
    {
        Node trav=head;
        if(head==null)
        {
            System.out.println("ls Empty ");
        }
        else
        {
            while(trav.next!=null)
            {
                 System.out.println("  "+trav.data+" ");
                 trav=trav.next;
            }
        }
    }
    
}
class Test {
    public static void main(String[] args) {
          doublylist dl=new doublylist();
          dl.add(6);
          dl.add(0);
          dl.add(6);
          dl.add(10);
          dl.add(5);
          dl.add(8);
          dl.add(12);
          dl.add(16);
          dl.add(7);
          dl.show();
    }
}