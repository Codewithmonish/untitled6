public class stringcompression {
    public static void main(String[] args) {
        char[] chars={'a','a','a','b','b'};

        System.out.println(comp(chars));
        //System.out.println(ans);

    }
    public static String comp(char[] chars){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while (i<chars.length){
            int j=i;
            while (j<chars.length && chars[i]==chars[j]){
                j++;

            }
            sb.append(chars[i]);
            int len=j-i;
            if (len>1){
                sb.append(len);
            }
            i=j;
        }
        for (int j = 0; j < sb.length(); j++) {
            chars[j]= sb.charAt(j);

        }
        return sb.toString();
    }
}
