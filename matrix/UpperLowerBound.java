public class UpperLowerBound {
//Upper  sum of i<=j
//lower  sum of i>=j

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{6,5,3},{2,1,5}};
        int upper=0;
        int lower=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i<=j){
                    upper=upper+arr[i][j];
                }
                if(i>=j){
                    lower=lower+arr[i][j];
                }

            }
        }
        System.out.println("Upper= "+upper);
        System.out.println("Lower= "+lower);
    }
}
