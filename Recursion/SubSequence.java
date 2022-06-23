import java.util.ArrayList;
public class SubSequence {
    static ArrayList<String> subseq(String name){
        if(name.length()==0){
            ArrayList<String>list=new ArrayList<>();
            list.add(" ");
            return list;
        }
        char singleChar=name.charAt(0);
        String subString=name.substring(1);
        ArrayList<String> result=subseq(subString);
        ArrayList<String>finalResult=new ArrayList<>();
        for(String s:result){
            finalResult.add(s);
            finalResult.add(singleChar+s);
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(subseq("amit"));
    }
}
