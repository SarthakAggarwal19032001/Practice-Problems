import java.util.*;
public class FindFrequencyOfElementInSubarray {
    public static void main(String[] args) {
        int arr[]={1,5,6,7,5,6,7,8,9};
        int k=3;
        int ele=5;
        int c=1;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++){
            if(arr[i]==ele){
                map.put(0,c );
                c++;
            }
        }
        
        for(int i=1;i<arr.length-k;i++){
            c=0;
            if(arr[i]==ele){
                map.put(i,c+1);
                c++;
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
