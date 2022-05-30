public class ThirdLargest {
    public static void main(String[] args) {
        int arr[]={10,2,5,4,19,6,0,2};
        int max1=-1;
        int max2=-1;
        int max3=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            }
            if(arr[i]!=max1){
                if(arr[i]>max2){
                    max3=max2;
                    max2=arr[i];
                }
                else if(arr[i]>max3){
                    max3=arr[i];
                }
            }
        }
        System.out.println(max3);
    }
}
