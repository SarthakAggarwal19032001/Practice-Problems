public class CountSetBit {
    public static void main(String[] args) {
        int n=10;
        int CountSetBit=0;
        while(n>0){
            if((n & 1)==1){
                CountSetBit++;
            }
            n=n>>1;
        }
        System.out.println("Set Bits count "+CountSetBit);
    }
}
