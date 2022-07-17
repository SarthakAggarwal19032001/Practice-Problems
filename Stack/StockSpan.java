import java.util.Stack;

class StockSpanner {
    static Stack<Integer>stack;
     static Stack<Integer>stack2;
     public StockSpanner() {
        stack=new Stack<>();
        stack2=new Stack<>();
     }
     public int next(int price) {
         int ans=1;
         if(!stack.isEmpty()){
         if(stack.peek()<=price){
             while(!stack.isEmpty() && stack.peek()<=price){
             stack2.push(stack.pop());
                 ans++;
             }
             while(!stack2.isEmpty()){
                 stack.push(stack2.pop());
             }
         }
     }
     stack.push(price);
     return ans;
 }
 }

public class StockSpan {
    public static void main(String[] args) {
        StockSpanner s=new StockSpanner();
        System.out.println(s.next(28));
        System.out.println(s.next(14));
        System.out.println(s.next(28));
        System.out.println(s.next(35));
        System.out.println(s.next(46));
        System.out.println(s.next(53));
        System.out.println(s.next(66));
        System.out.println(s.next(80));
        System.out.println(s.next(87));
        System.out.println(s.next(88));
    }
}
