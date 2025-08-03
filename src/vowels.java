public class vowels {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(revers(s));

    }
    public static boolean isvowels(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' ||c=='u');
    }
    public static String revers(String s){
        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while (i<=j){
            while (i<j && !isvowels(ch[i])) i++;
            while (i<j && !isvowels(ch[j])) j--;
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++;
            j--;
        }
        return new String(ch);
    }
}
