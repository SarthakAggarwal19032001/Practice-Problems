public class lcs {
    static int LCS(String str1,String str2,int n,int m,int [][]cache){
        if(n<0 || m<0){
            return 0;
        }
        //memorization technique / Top Down Approach
        if(cache[n][m]!=0){
            return cache[n][m];
        }
        int count=0;
                if(str1.charAt(n)==str2.charAt(m)){
                count=1+LCS(str1,str2,n-1,m-1,cache);
                cache[n][m]=count;
                }
                else{
                    int option1=0;
                    int option2=0;
                    option1=LCS(str1, str2, n-1, m,cache);
                    option2=LCS(str1, str2, n, m-1,cache);
                    count= Math.max(option1, option2);
                    cache[n][m]=count;
                }
                return count;
    }
    // Tabulation method
    static int LCS(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int matrix[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    matrix[i][j]=0;
                    continue;
                }
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    matrix[i][j]=matrix[i-1][j-1]+1;
                }
                else{
                    matrix[i][j]=Math.max(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[n][m];
    }
    //return longest common subsequence length
    public static void main(String[] args) {
        String str1="AGGTAB";
        String str2="GXTXAYB";
        int cache[][]=new int[str1.length()][str2.length()];
        int length=LCS(str1,str2,str1.length()-1,str2.length()-1,cache);
        System.out.println(length);
        System.out.println("Tabulation-------------------------------");
        System.out.println(LCS(str1, str2));
    }
}
