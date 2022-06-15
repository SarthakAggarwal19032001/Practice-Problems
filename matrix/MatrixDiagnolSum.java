public class MatrixDiagnolSum {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        int len=mat[0].length;
        for(int i=0;i<len;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }
                if(i+j==(len-1) && (i!=j)){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}
