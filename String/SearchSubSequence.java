public class SearchSubSequence {
    public static void main(String[] args) {
        String str="sarthak";
        String Search="th";
        int j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==Search.charAt(j)){
                j++;
                if(j==Search.length()){
                    System.out.println("Found");
                    break;
                }
            }
        }
    }
}
