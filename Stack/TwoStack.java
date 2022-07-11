class stacktwo{
    int arr[];
    int capacity;
    int lefttop;
    int rightop;
    stacktwo(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        lefttop=-1;
        rightop=capacity;
    }
    
    void leftpush(int data){
            lefttop++;
            if(lefttop==rightop){
                lefttop--;
                throw new RuntimeException("Stack is full cannot add more items");
            }
            arr[lefttop]=data;
        }

        int leftpop(){
            if(lefttop==-1){
                throw new RuntimeException("Left Stack is empty");
            }
            lefttop--;
            return arr[lefttop+1];
        }

        int leftpeek(){
            if(lefttop==-1){
                throw new RuntimeException("Left Stack is empty");
            }
            return arr[lefttop];
        }


        void rightpush(int data){
            rightop--;
            if(lefttop==rightop){
                rightop--;
                throw new RuntimeException("Stack is full cannot add more items");
            }
            arr[rightop]=data;
        }

        int rightpop(){
            if(rightop==capacity){
                throw new RuntimeException("Right Stack is empty");
            }
            rightop++;
            return arr[rightop-1];
        }

        int rightpeek(){
            if(rightop==capacity){
                throw new RuntimeException("Left Stack is empty");
            }
            return arr[rightop];
        }
    }

public class TwoStack {
    //Space Optimize stack
    public static void main(String[] args) {
    stacktwo ts=new stacktwo(10);
    ts.leftpush(10);
    ts.rightpush(100);
    ts.leftpush(20);
    ts.rightpush(90);
    ts.leftpush(30);
    ts.rightpush(80);
    ts.leftpush(40);
    ts.rightpush(70);
    System.out.println(ts.rightpop());
    System.out.println(ts.leftpop());
    System.out.println(ts.rightpeek());
    System.out.println(ts.leftpeek());
    System.out.println(ts.leftpop());
    System.out.println(ts.rightpeek());
    System.out.println(ts.leftpeek());
}
}