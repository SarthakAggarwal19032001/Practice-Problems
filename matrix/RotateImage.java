public class RotateImage {
    public static void rotate(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int a[]:matrix){
        for(int i=0,j=(matrix.length-1);i<j;i++,j--){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    }
    public static void main(String[] args) {
       int  matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int a[]:matrix){
            for(int u:a){
        System.out.print(u+" ");
            }
        System.out.println();
    }
    }
}
