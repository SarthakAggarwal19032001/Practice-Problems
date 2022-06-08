public class RunLengthEncoding {
    public static void main(String[] args) {
        String str="c";
        int c=1;
	    StringBuilder s=new StringBuilder();
        if(str.length()==1){
            System.out.println(str+1);;
        }
	    char ch=str.charAt(0);
          for(int i=1;i<str.length();i++){
              if(ch==str.charAt(i)){
                  c++;
              }
              else{
                s.append(ch).append(c);
                ch=str.charAt(i);
                c=1;
              }
              if(i==str.length()-1){
                s.append(ch).append(c);
                ch=str.charAt(i);
              }
          }
          System.out.println(s.toString());
    }
}
