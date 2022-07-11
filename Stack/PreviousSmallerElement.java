import java.util.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int arr[]={2,5,3,7,8,1,9};
        Stack<Integer>stack=new Stack<>();
        stack.push(arr[0]); 
        System.out.println(-1); //store the first element

// TC is only constant

        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop(); //TC O(N)
            }
            int previoussmallele=stack.isEmpty()?-1:stack.peek();
            System.out.println(previoussmallele+ " ");
            stack.push(arr[i]);
        }
    }
}
