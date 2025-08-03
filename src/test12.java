public class test12 {
    public static void main(String[] args) {
        String s="education";
        consonents(s);

    }
    public static String removevow(String s){
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if (!vowel(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean vowel(char s){
        s=Character.toLowerCase(s);
        return s=='a' || s=='e' || s=='i' || s=='o' ||s=='u';
    }
    public static void consonents(String s){
        s=s.toLowerCase();
        int vowel=0;
        int conso=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                vowel++;
            }
            else {
                conso++;

            }


        }
        System.out.println(vowel);
        System.out.println(conso);



    }
}
