import java.util.*;
public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<Integer>();

        if(matrix.length == 1 && matrix[0].length == 1){
            l.add(1);
            return l;
        }
        
        int mode = 0;
        int i = 0; int j = 0;
        
        
        while(true){
            if(i == matrix.length || j == matrix[0].length || j == -1 || i == -1 || matrix[i][j] == -101){
                break;
            }
            if(mode == 0){ // right
                l.add(matrix[i][j]);
                matrix[i][j] = -101;
                if(j+1 > matrix[0].length - 1){
                    mode++;
                }
                else if(matrix[i][j+1] == -101){
                    mode++;
                }
                
                if(mode == 1){
                    i = i + 1;
                    continue;
                }
                else{
                    j = j + 1;
                    continue;
                }
            }
            if(mode == 1){ // down
                l.add(matrix[i][j]);
                matrix[i][j] = -101;
                if(i + 1 > matrix.length - 1){
                    mode++;
                }
                else if(matrix[i+1][j] == -101){
                    mode++;
                }
                
                if(mode == 2){
                    j = j - 1;
                    continue;
                }
                else{
                    i = i + 1;
                    continue;
                }
            }
            if(mode == 2){ // left
                l.add(matrix[i][j]);
                matrix[i][j] = -101;
                if(j - 1 < 0){
                    mode++;
                }
                else if(matrix[i][j - 1] == -101){
                    mode++;
                }
                
                if(mode == 3){
                    i = i - 1;
                    continue;
                }
                else{
                    j = j - 1;
                    continue;
                }
            }
            if(mode == 3){ // up
                l.add(matrix[i][j]);
                matrix[i][j] = -101;
                if(matrix[i - 1][j] == -101){
                    mode = 0;
                }
                
                if(mode == 0){
                    j = j + 1;
                    continue;
                }
                else{
                    i = i - 1;
                    continue;
                }
            }
        }
        return l;
        
        
    }
    public static void main(String[] args) {
        int [][]matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralOrder(matrix));
    }
}
