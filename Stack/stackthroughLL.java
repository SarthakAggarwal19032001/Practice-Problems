    class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    class operations{
        Node head;
        void push(int data){
            Node node=new Node(data);
            if(head==null){
                head=node;
            }
            else {
                node.next=head;
                head=node;
            }
        }
        int pop(){
            int val=0;
            if(head==null){
                throw new RuntimeException("Stack is empty");
            }
            else {
                val=head.data;
                head=head.next;
            }
            return val;
        }

        int peek(){
            if(head==null){
                throw new RuntimeException("Stack is empty");
            }
            return head.data; 
        }
    }
    public class stackthroughLL {
    public static void main(String[] args) {
        operations op=new operations();
        op.push(10);
        op.push(20);
        op.push(30);
        op.push(40);
        op.push(50);
        System.out.println(op.pop());
        System.out.println(op.peek());
    }
}
