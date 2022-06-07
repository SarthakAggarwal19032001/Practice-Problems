class SunArraySum{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        int sum=0;
        int tsum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        tsum=sum;
        System.out.println(sum);
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            if(sum>tsum){
                tsum=sum;
            }
            System.out.println(sum);
            //System.out.println();
        }
        System.out.println("Maximum Sum was"+tsum);
    }
}