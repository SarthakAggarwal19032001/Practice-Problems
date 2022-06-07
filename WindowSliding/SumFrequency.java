import java.util.HashMap;
import java.util.Map;

//import java.util.Set;

public class SumFrequency {
    public static void main(String[] args) {
        int arr[]={1,5,6,7,5,6,7,8,9};
        Map<Integer,Integer>map=new HashMap<>();
        int k=3;
        int sum=0;
        int c=1;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        map.put(sum,c );
        //System.out.println(sum);
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if(map.containsKey(sum)){
                map.put(sum, c+1);
            }
            else{
                map.put(sum, c);
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
