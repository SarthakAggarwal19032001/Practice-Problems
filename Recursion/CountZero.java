public class CountZero {
    static int count=0;
    static int countZero(int n){
        int rem=n%10;
        n=n/10;
        if(rem==0){
            count++;
        }
        else if(n==0){
            return 0;
        }
        countZero(n);
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countZero(12090003));
    }
}
