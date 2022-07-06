class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
        next=null;

    }
}

// class DoublyNode<T>{
//     T data;
//     Node<T> prev;
//     Node<T> next;
// }

// class CircularNode<T>{
//     T data;
    
//     Node<T> next; // next contains the address of start node.
// }


    class Operations<T>{
        Node<T> head;
        //Node<T> tail;

        void addatBeg(T data){
            Node<T> node=new Node<>(data);
            if(head==null){
                head=node;
            }
            else{
                node.next=head;
                head=node;
            }
        }

    void addatEnd(T data){
        Node<T> node=new Node<>(data);
        if(head==null){
            head=node;
        }
        else{
            Node<T> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }
}

    void addatKth(T data, int k){
        Node<T> node=new Node<T>(data);
        Node<T> temp=head;
        int i=1;
        while(i<k-1){
            temp=temp.next;
            i++;
        }
        node.next=temp.next;
        temp.next=node;

    }


    void addAtMid(T data){
        if(head==null){
            System.out.print("Empty LL");
            return;
        }
        else if(head.next==null){
            addatBeg(data);
            return;
        }
        else{
        Node<T> slow;
        Node<T> fast;
        slow=head;
        fast=head.next.next;
        while(fast!=null && fast.next!=null){ //considering both odd and even cases
            fast=fast.next.next;
            slow=slow.next;
        } 
        Node<T> node=new Node<T>(data);
        Node<T> temp=slow.next;
        slow.next=node;
        node.next=temp;
    }

    }

    void deleteAtMid(){
        if(head==null){
            System.out.print("Empty LL");
            return;
        }
        else if(head.next==null){
            head=null;
            head.next=null;
            return;
        }
        //odd case
        else{
        Node<T> slow;
        Node<T> fast;
        slow=fast=head;
        while(fast!=null && fast.next!=null){ //considering both odd and even cases
            fast=fast.next.next;
            slow=slow.next;
        } 
        Node<T> temp=head;
        while(temp.next!=slow){
            temp=temp.next;
        }
        System.out.println(slow.data);
        temp.next=slow.next;
        slow=null;
    }
    }

    void deleteAtEnd(){
        if(head==null){
            System.out.print("Empty Linked List");
            return;
        }
        else if(head.next==null){
            head=null;//eligible for gc 
            return;
        }
        else{
            /*
             Node<T> temp = start;
        Node<T> temp2 = start;
        while(temp.next != null){
            temp2 = temp;
            temp= temp.next; 
        }
        temp2.next = null;
        temp = null;
            */
        Node<T> temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    }


    void deleteAtBeg(){
        if(head==null){
            System.out.print("Empty LL");
            return;
        }
        else if(head.next==null){
            head=null;
            return;
        }
        else{
            Node<T> temp=head;
            head=head.next;
            temp.next=null;
            temp=null;
        }
    }
    int  length(){
        Node<T> temp=head;
        int c=0;
        while(temp.next!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }

    void PrintAtMid(){
        //floyd Algorithm(slow-fast algo)
        if(head==null){
            System.out.print("Empty LL");
            return;
        }
        else if(head.next==null){
            System.out.println(head.data);
            return;
        }
        else{
            int len=length();
        if(len%2!=0){
         Node<T> slow;
         Node<T> fast;
         slow=fast=head;
        //Odd list
        while(fast!=null && fast.next!=null){ //considering both odd and even cases
            fast=fast.next.next;
            slow=slow.next;
        } 
        System.out.println(slow.data);
    }
    else{
        Node<T> slow;
         Node<T> fast;
         slow=head;
         fast=head.next.next;
         while(fast!=null && fast.next!=null){ //considering both odd and even cases
            fast=fast.next.next;
            slow=slow.next;
        } 
        System.out.println(slow.data);
    }
    }
}

    void printkth(int k){
        Node<T>temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);

    }

    void print(){
        Node<T> temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

class SingleLL{
    public static void main(String[] args) {
        Operations<Integer>op=new Operations<>();
        op.addatEnd(10);
        op.addatEnd(20);
        op.addatEnd(30);
        op.addatEnd(40);
        op.addatEnd(50);
        op.addatBeg(-10);
        op.print();
        op.deleteAtEnd();
        // op.deleteAtEnd();
        // op.deleteAtEnd();
        op.print();
        System.out.println();
        op.deleteAtBeg();
        op.print();
        System.out.println();
        op.PrintAtMid();
        op.addAtMid(25);
        op.print();
        System.out.println();
        op.deleteAtMid();
        System.out.println();
        op.print();
        op.addatKth(25, 3);
        op.print();
        System.out.println();
        op.printkth(3);

    }
}