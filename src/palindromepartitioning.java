import java.util.ArrayList;
import java.util.List;

public class palindromepartitioning {
    public static void main(String[] args) {
        String s="aabb";
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        String ans=fun(0,s,res,path);
        System.out.println(ans);


    }
    static String fun(int index, String s, List<List<String>> res, List<String> path){
        if (index==s.length()){
            res.add(new ArrayList<>(path));
            return s;
        }
        for (int i = index; i < s.length(); i++) {
            if(ispalin(s,index,i)){
                path.add(s.substring(index,i+1));
                fun(i+1,s,res,path);
                path.remove(path.size()-1);
            }

        }
        return s;
    }
    static boolean ispalin(String s, int start, int end){
        while (start<=end){
            if (s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
