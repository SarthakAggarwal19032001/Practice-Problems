public class OddTimeOccur {
    public static void main(String[] args) {
        int arr[]={10,20,10,20,10,10,66,22,10,10,10,66,22};
        int odd=0;
        for(int a:arr){
            odd=odd^a;
        }
        System.out.println("Odd occured element is "+odd);
    }
}
