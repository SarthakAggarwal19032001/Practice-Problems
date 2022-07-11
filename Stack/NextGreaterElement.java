import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args){
        int arr[]={4,5,2,25};
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer>stack=new Stack<>();
        stack.push(arr[arr.length-1]);
        list.add(-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            int ngl=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
            list.add(ngl);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
