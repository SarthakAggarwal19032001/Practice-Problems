public class FibonaciiSeries {
    static int sum=1;
    static void fibo(int n,int i,int j){
        if(n==0){
            return;
        }
        n--;
        sum=i+j;
        i=j;
        j=sum;
        System.out.print(","+sum);
        fibo(n, i, j);
    }
    public static void main(String[] args) {
        int n=3;
            System.out.print(0+","+1);
        fibo(n-2,0,1);
    }
}
