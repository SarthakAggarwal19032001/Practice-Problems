public class NextGreaterElement {
    public int nextGreaterElement(int n) {
        int rem=n%10;
        int i=10;
        int u=n;
        int ans=0;
            n=n/10;
        while(n!=0){
            int r=n%10;
            n=n/10;
            if(r<rem){
                ans=(n*i*10)+(rem*i)+r;
                if(ans>u){
                    return ans;
                }
            }
            rem=r;
            i=i*10;
        }
        return -1;
    }




    public static void main(String[] args) {
        int n=230241;
        NextGreaterElement nxt=new NextGreaterElement();
        int ans=nxt.nextGreaterElement(n);
        System.out.println(ans);
    }
}
