public class RightParamid {
     /*
       ***** 
       ****
       ***
       **
       * 
    */
    static void rightp(int n,int i){
        if(n<i){
            return;
        }
        printstar(n);
        System.out.println();
        n--;
        rightp(n, i);
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
        rightp(n,row);
    }
}

