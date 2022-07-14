
//At one time either it can be push efficient or pop efficient
public class StackUsingQueue {

    //push efficient
    //Using class Queue
  queue q1=new queue(10);
  queue q2=new queue(10);

  void push(int data){
    q1.enqueue(data);
  }
  int pop(){
    while(!q1.isEmpty()){
        q2.enqueue(q1.dequeue());
    }
    int p=q2.dequeue();//LIFO
    while(!q2.isEmpty()){
        q1.enqueue(q2.dequeue());
    }
    return p;
  }

}

 class StackUsingQueue2{
    //pop efficient
    queue q1=new queue(10);
    queue q2=new queue(10);
    void push(int data){
        while(!q1.isEmpty()){
            q2.enqueue(q1.dequeue());
        }
        q2.enqueue(data);
        while(!q2.isEmpty()){
            q1.enqueue(q2.dequeue());
        }
    }
    int pop(){
        return q1.dequeue();
    }

}



//Through Linked List ------Using class QueueLL
class StackUsingQueueUsingLL{
  operations op=new operations();
  //push efficient
  void push(int data){
  op.enqueue(data);
  }
  int pop(){
    operations op1=new operations();
    while(op.front!=null){
      op1.enqueue(op.dequeue());
    }
    int a=op1.dequeue();
    while(op1.front!=null){
      op.enqueue(op1.dequeue());
    }
    return a;
  }

  public static void main(String[] args) {
    StackUsingQueueUsingLL sq=new StackUsingQueueUsingLL();
    sq.push(10);
    sq.push(20);
    sq.push(30);
    System.out.println(sq.pop());
  }
}
