class MyStack {
    int arr[];
    int top;
    int capacity;

    MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity]; // all are field with 0
        top = -1;
    }

    void push(int element) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack is Full Can't Add it...");

        }
        top++;
        arr[top] = element;

    }

    int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty can't pop...");

        }
        // pop top most element
        int element = arr[top];
        top--;
        return element;
    }

    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty !...");

        } else {
            return arr[top];
        }
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class stack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
