public class Power {
    static int pow(int n,int p){
        if(p==1){
            return n;
        }
        return n*pow(n,p-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
}
