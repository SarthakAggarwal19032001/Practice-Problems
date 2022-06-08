public class PalindromeSubstring {
    //Substring-Contigous
    //SubSequence-Not Necessary Contigous
   static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if((s.charAt(i)!=(s.charAt(j)))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
       // PalindromeString p=new PalindromeString();
        String s="abccbc";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp=s.substring(i, j);
                boolean r=isPalindrome(temp);
                if(r){
                    System.out.print(temp+" ");
                }
            }
            System.out.println();

        }

    }
}
