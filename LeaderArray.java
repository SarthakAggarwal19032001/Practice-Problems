public class LeaderArray {
    void printLeader(int arr[],int n){
        int rleader=arr[n-1];
        System.out.println(rleader);
        for(int i=n-2;i>0;i--){
            if(arr[i]>rleader){
                rleader=arr[i];
                System.out.println(rleader);
            }
        }
    }
    public static void main(String[] args) {
        LeaderArray la=new LeaderArray();
        int [] arr={16,17,4,3,5,2};
        int n=arr.length;
        la.printLeader(arr, n);
    }
}
