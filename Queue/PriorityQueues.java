import java.util.PriorityQueue;

public class PriorityQueues {// also Heap
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((Integer a,Integer b)->a.compareTo(b));//lamda (results in printing int increasing order of element)
        pq.add(10);
        pq.offer(20);
        pq.add(30);
        pq.offer(9);//offer same as add
        pq.offer(1);
        pq.offer(5);

        System.out.println(pq.poll());//poll same as pop
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

    }
}
