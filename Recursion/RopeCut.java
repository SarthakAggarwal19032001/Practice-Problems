public class RopeCut {
    //Working in Depth First Traverse mannner
    static int countMaxCut(int RopeLength,int a,int b,int c){
        if(RopeLength==0){
            return 0;
        }
        if(RopeLength<0){
            return -1;
        }
        int aCut=countMaxCut(RopeLength-a, a, b, c);
        int bCut=countMaxCut(RopeLength-b, a, b, c);
        int cCut=countMaxCut(RopeLength-c, a, b, c);
        int max=(int)Math.max(aCut, bCut);
        max=(int)Math.max(max, cCut);
        if(max==-1){
            return -1;
        }
        return max+1;
    }
    public static void main(String[] args) {
        System.out.println(countMaxCut(23,12,9,11));
    }
}
