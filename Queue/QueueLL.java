class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class operations{
    Node front,rear=null;
    void enqueue(int data){
        Node node=new Node(data);
        if(front==null){
            front=rear=node;
        }
        else{
            rear.next=node;
            rear=node;
        }
    }

    void dequeue(){
        if(front==null){
            throw new RuntimeException("Empty Queue.....................................");
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
    }

    void print(){
        if(front==null){
            throw new RuntimeException("Empty Queue................................");
        }
        Node temp=front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

class QueueLL{
    public static void main(String[] args) {
        operations op=new operations();
        op.enqueue(10);
        op.enqueue(20);
        op.enqueue(30);
        op.enqueue(40);
        op.enqueue(50);
        op.print();
        System.out.println();
        op.dequeue();
        op.dequeue();
        op.dequeue();
        op.print();
        System.out.println();
        op.enqueue(60);
        op.print();
    }
}