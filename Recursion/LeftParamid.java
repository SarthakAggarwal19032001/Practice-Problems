public class LeftParamid {
    /* * 
       ** 
       ***
       ****
       ***** 
    */
    static void leftp(int n,int i){
        if(i>n){
            return;
        }
        printstar(i);
        System.out.println();
        i++;
        leftp(n, i);
    }
    static void printstar(int i){
        if(i==0){
            return;
        }
        System.out.print("*");
        printstar(i-1);
    }
    public static void main(String[] args) {
        int n=5;
        int row=1;
        leftp(n,row);
    }
}
