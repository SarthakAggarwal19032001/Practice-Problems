//CQ using array
class CQ{
    int data[];
    int front;
    int rear;

    CQ(int capacity) {
        data = new int[capacity];
        front = rear = 0;
    }
    void enqueue(int element) {
        if (rear==data.length) {
            throw new RuntimeException("circular queue is full");
        }
        int index = (front + rear) % data.length;
        data[index] = element;
        rear++;
    }

    int dequeue() {
        if (rear == 0) {
            throw new RuntimeException("Queue is Empty");
        }
        int element = data[front];
        data[front] = 0; // delete
        front = front + 1;
        rear--;
        return element;
    }

    void print() {
        for (int i = 0; i < rear; i++) {
            int index = (front + i) % data.length;
            System.out.println(data[index]);
        }
    }
}






//     

// public class QueueArray {
// public static void main(String[] args) {
//     Queue queue = new Queue(5);
//     queue.enqueue(10);
//     queue.enqueue(20);

//     queue.enqueue(30);
//     queue.enqueue(40);
//     queue.enqueue(50);
//     System.out.println(queue.getSize());
//     System.out.println(queue.getFront());
//     System.out.println(queue.dequeue());
//     System.out.println(queue.dequeue());
//     System.out.println(queue.getFront());

// }
// }





public class CircularQueue {
    public static void main(String[] args) {
        CQ cq=new CQ(7);
        cq.enqueue(2);
        cq.enqueue(5);
        cq.enqueue(6);
        cq.enqueue(7);
        cq.enqueue(8);
        cq.enqueue(9);
        cq.enqueue(10);
        cq.print();
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        System.out.println();
        cq.print();

    }
}
