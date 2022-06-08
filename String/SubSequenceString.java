import java.util.ArrayList;

public class SubSequenceString {
    public static void main(String[] args) {
        String str="abcd";
        ArrayList<String> s=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char firstchar=str.charAt(i);
            if(s.size()==0){
                s.add("");
                s.add(""+firstchar);
                continue;
            }
            else{
                int sublen=s.size();
                for(int j=0;j<sublen;j++){
                    String temp=s.get(j)+firstchar;
                    s.add(temp);
                }
            }
        }
        System.out.println(s+" ");
    }
}
