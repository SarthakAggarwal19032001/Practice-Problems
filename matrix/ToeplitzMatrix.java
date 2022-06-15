public class ToeplitzMatrix {
    boolean isToeplitzMatrix(int[][] matrix){
        boolean flag=true;
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++){
                if(matrix[i][j]==matrix[i+1][j+1]){
                    flag=true;
                }
                else{
                    return false;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        ToeplitzMatrix t=new ToeplitzMatrix();
        boolean b=t.isToeplitzMatrix(matrix);
        System.out.println(b);
    }

}
