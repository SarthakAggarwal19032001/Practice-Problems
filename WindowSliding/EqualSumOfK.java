public class EqualSumOfK {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        int sum=0;
        int tsum=18;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum==tsum){
            for(int i=0;i<k;i++){
                System.out.print(arr[i]);
            } 
        }
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum==tsum){
                    System.out.print(arr[i-k+1]+" "+arr[i-k+2]+" "+arr[i]);
    }
}
    }
}
