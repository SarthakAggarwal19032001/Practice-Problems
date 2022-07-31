public class BitManipulation {
    public static void main(String[] args) {
        
        //check odd or even

        int x=10;
        int y=11;
        int v=x&1;  //check for last bit if it is 0 than no. is even else odd

        if(v==0){
            System.out.println("It is even");
        }
        else{
            System.out.println("It is odd...");
        }

        System.out.println(x | y); //if either bit is one than 1 else 0
        System.out.println(x ^ y); //if same bits than 0 else 1
        System.out.println(~x);// gives negative number if it is positive and vice versa
        System.out.println(x<<1);//left shift
        System.out.println(y>>2);//right shift
    }
}
