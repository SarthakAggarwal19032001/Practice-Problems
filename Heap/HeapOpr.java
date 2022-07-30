import java.util.ArrayList;



class Heap{
    ArrayList<Integer>list=new ArrayList<>();

    void add(int element){
        list.add(element);
        upHeapify(list.size()-1);
    }
    //min heap


    //add operation -upheapify
    void upHeapify(int childIndex){
        int parentIndex= (childIndex - 1)/2;
        if(list.get(childIndex)<list.get(parentIndex)){
           swap(parentIndex, childIndex);
           upHeapify(parentIndex);
        }
     }

     void Heapsort(){
      ArrayList<Integer>sorted=new ArrayList<>();
      for(int i=list.size()-1;i>=0;i--){
         sorted.add(list.get(0));
         swap(0, i);
         sortdownheap(0,i);
      }
      System.out.println("Sorted --------");
      System.out.println(sorted);
     }

     void sortdownheap(int parentIndex,int n){
      int minIndex=parentIndex;
      int lci=2*parentIndex+1;
      int rci=2*parentIndex+2;
      if(lci<n && list.get(lci)<list.get(minIndex)){
         minIndex=lci;
      }
      if(rci<n && list.get(rci)<list.get(minIndex)){
         minIndex=rci;
      }

      if(parentIndex!=minIndex){
         swap(parentIndex, minIndex);
         sortdownheap(minIndex, n);
      }
   }


     //remove element or sort then downheapify
     void downHeapify(int parentIndex){
        int lci=(2*parentIndex+1);
        int rci=(2*parentIndex+2);
        int minIndex=parentIndex;
        if(lci<list.size() && list.get(lci)<list.get(parentIndex)){
         minIndex=lci;
        }
        if(rci<list.size() && list.get(rci)<list.get(parentIndex)){
         minIndex=rci;
     } 
     if(parentIndex!=minIndex){
      swap(parentIndex, minIndex);
      downHeapify(parentIndex);
     }
   }

   

   void removeMin(){
      swap(0,list.size()-1);
      list.remove(list.size()-1);
      for(int i=0;i<=(list.size()/2)-1;i++){
         downHeapify(i);
      }
   }

   void print(){
      System.out.println("-------------------List------------------------------");
      System.out.println(list);
   }

     void swap(int parentIndex,int childIndex){
        int parentValue = list.get(parentIndex);
        int childValue = list.get(childIndex);
        list.set(childIndex, parentValue);
        list.set(parentIndex, childValue);
     }
}


class HeapOpr{
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(10);
        h.add(3);
        h.add(1);
        h.add(20);
        h.add(2);
        h.add(9);
      //   h.add(50);
      //   h.add(15);
      //   h.add(13);
      //   h.add(30);
        h.print();
      //   h.removeMin();
        h.print();
        h.Heapsort();

      //   h.removeMin();
      //   h.print();

    }
}