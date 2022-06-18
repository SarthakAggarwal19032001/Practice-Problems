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
// Apporach 2-------------------------------------------------------------------------------------------------------------------------
    static int  fibo(int n){// returns sum;
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        int n=5;
            //System.out.print(0+","+1);
        //fibo(n-2,0,1);
        System.out.println(fibo(n));
    }
}
