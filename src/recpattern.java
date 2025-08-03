public class recpattern {
    public static void main(String[] args) {
        System.out.println(skip("baccad"));


    }
    static String skip(String s){
        if (s.isEmpty()){
            return " ";
        }
        char ch=s.charAt(0);
        if (ch=='a'){
            return skip(s.substring(1));
        }else {
            return ch+skip(s.substring(1));
        }
    }

}
