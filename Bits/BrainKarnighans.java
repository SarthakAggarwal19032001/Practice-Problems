public class BrainKarnighans {
    public static void main(String[] args) {
        //Count set bIts algo
        int n=10;
        int c=0;
        while(n>0){
            n=n & (n-1);
            c++;
        }
        System.out.println("No. of Set Bits "+c);
    }
}
