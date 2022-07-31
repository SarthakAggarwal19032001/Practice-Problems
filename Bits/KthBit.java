import java.util.Scanner;
class KthBit{
    //check kth bit is set or not
    //set means 1 (on)
    //Unset means 0 (off)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        n= n>>k-1;
        System.out.println("Kth bit was "+(n & 1));
        sc.close();
    }

    
}