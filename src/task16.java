

public class task16 {
    static void permutation(String input,String result){
        if(input.length()==0){
            System.out.println(result +" ");
        }
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            String rest=input.substring(0,i) + input.substring(i+1);
            permutation(rest,result + ch);
        }
    }
    public static void main(String[] args) {
        String inputstring="abcd";
        permutation(inputstring,"" );
    }
}
