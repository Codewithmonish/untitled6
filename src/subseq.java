import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        subseq("","cd");
        //System.out.println(subseqret("","123"));

    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p,up.substring(1));
        subseq(p+ch,up.substring(1));
    }
    static ArrayList<String> subseqret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;


        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqret(p,up.substring(1));
        ArrayList<String> right=subseqret(p+ch,up.substring(1));
        ArrayList<String> rightleft= subseqret(p+ch,up.substring(1));

        rightleft.addAll(left);
        rightleft.addAll(right);
        return rightleft;
    }
}
