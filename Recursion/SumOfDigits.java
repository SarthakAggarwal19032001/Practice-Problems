public class SumOfDigits {
    static int sumd(int n){
        int rem=n%10;
        n=n/10;
        if(n==0){
            return rem;
        }
        return rem+sumd(n); 
    }
    public static void main(String[] args) {
        System.out.println(sumd(12345));
    }
}
