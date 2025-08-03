 import java.lang.String;
public class project2 {
    public static void main(String[] args) {
        String s="mom";
        int start=0;
        int last=s.length();
        while(start<=last){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(last))) {
                last--;

            }else{
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))){

                }
                start++;
                last--;
            }
        }


    }
}