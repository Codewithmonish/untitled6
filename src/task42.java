public class task42 {
    public static void main(String[] args) {
        String s="abcdcba";
        int i=0;
        int j=s.length();
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                System.out.println("not");
            }
            i++;
            j++;
        }
        System.out.println("corrct");

    }
}
