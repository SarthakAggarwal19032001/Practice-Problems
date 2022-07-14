//Using Arrays
class queue{
    int data[];
        int capacity;
        int front;
        int rear;
        int size;
        queue(int capacity){
            this.capacity=capacity;
            data=new int[capacity];
            front=rear=-1;
            size=0;// Queue is empty9size is 0)
        }

        void enqueue(int element){
                    if(size==0){
                        front++;
                        rear++;
                        data[rear]=element;
                        size++;
                        return;
                    }
                    if(size==data.length){
                        throw new RuntimeException("Queue is full.........................");
                    }
                    rear++;
                    size++;
                    if(rear==data.length){
                        rear=0;
                    }
                    data[rear]=element;
                }
            
            int dequeue() {
                if (size == 0) {
                    throw new RuntimeException("Queue is Empty");
                }
                int frontElement = data[front];
                front++; // front move to next element
                if (front == data.length) {
                    front = 0;
                }
                size--;
                if (isEmpty()) {
                    front = rear = -1;
                }
                return frontElement;
            }
            
            int getSize() {
                return size;
            }
            
            int getFront() {
                if (getSize() == 0) {
                    throw new RuntimeException("No Front Queue is Empty");
                }
                return data[front];
            }
            
            int getRear() {
                if (getSize() == 0) {
                    throw new RuntimeException("No Front Queue is Empty");
                }
                return data[rear];
            }
            
            boolean isEmpty() {
                return size == 0;
            }

            public static void main(String[] args) {
                    queue queue = new queue(5);
                    queue.enqueue(10);
                    queue.enqueue(20);
                    queue.enqueue(30);
                    queue.enqueue(40);
                    queue.enqueue(50);
                    System.out.println(queue.getSize());
                    System.out.println(queue.getFront());
                    System.out.println(queue.dequeue());
                    System.out.println(queue.dequeue());
                    System.out.println(queue.getFront());
            }
    }


