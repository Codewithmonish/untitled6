import java.util.ArrayList;

public class phonenumber {
    public static void main(String[] args) {
        System.out.println(phn("","32"));
    }
    static ArrayList<String> phn(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        for (int i = (digits-1)*3; i <digits*3 ; i++) {
            char ch=(char) ('a'+i);
           list.addAll( phn(p+ch,up.substring(1)));
        }
        return list;
    }
}
