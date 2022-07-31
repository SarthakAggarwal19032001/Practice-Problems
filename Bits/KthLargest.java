import java.util.Collections;
import java.util.PriorityQueue;
public class KthLargest {

    void KthMin(){
        int arr[]={13,12,11,14,15,17,18,20,19,16};
        int k=4;
        PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());//Max Heap
        for(int a:arr){
            heap.offer(a);
            if(heap.size()>k){
                heap.poll();
            }
        }
        System.out.println(heap.poll());
    }
    public static void main(String[] args) {
        int arr[]={13,12,11,14,15,17,18,20,19,16};
        int k=4;
        //Prority Queue Internally Uses Min Heap
        PriorityQueue<Integer>heap=new PriorityQueue<>();
        for(int a:arr){
            heap.offer(a);
            if(heap.size()>k){
                heap.poll();
            }
        }
        System.out.println(heap.poll());
        KthLargest kth=new KthLargest();
        kth.KthMin();
    }

}