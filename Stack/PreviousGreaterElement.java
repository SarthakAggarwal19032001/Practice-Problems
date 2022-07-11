import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int arr[]={10,4,2,20,40,12,30};
        Stack<Integer>stack=new Stack<>();
        stack.push(arr[0]); 
        System.out.println(-1); //store the first element

// TC is only constant

        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop(); //TC O(N)
            }
            int previousgr8ele=stack.isEmpty()?-1:stack.peek();
            System.out.println(previousgr8ele+ " ");
            stack.push(arr[i]);
        }
    }
}
