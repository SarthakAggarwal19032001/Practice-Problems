import java.util.ArrayList;

public class DiceGame {
    static ArrayList<String>dice(int currentval,int endvalue){
        if(currentval==endvalue){
            ArrayList<String>list=new ArrayList<>();
            list.add("");
            return list;
        }
        if(currentval>endvalue){
            ArrayList<String>list=new ArrayList<>();
            return list;
        }
        ArrayList<String>finalResult=new ArrayList<>();
        for(int dice=1;dice<=6;dice++){
            int newval=currentval+dice;
            ArrayList<String>result=dice(newval, endvalue);
            for(String s:result){
                finalResult.add(s+dice);
            }
        }
        return finalResult;
    }
    public static void main(String[] args) {
        System.out.println(dice(0, 10));
    }
}
