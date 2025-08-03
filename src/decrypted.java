public class decrypted {
    public static void main(String[] args) {
        String n="ab2bc2";
        String ans=dey(n);
        System.out.println(ans);

    }
    public static String dey(String n) {
       // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        int i=0;
        while (i<n.length()){
            char ch=n.charAt(i);
            i++;
            StringBuilder count =new StringBuilder();
            while (i<n.length() && Character.isDigit(n.charAt(i))){
                count.append(n.charAt(i));
                i++;

            }
            int c=Integer.parseInt(count.toString());
            for (int j = 0; j < c;j++) {
                sb.append(ch);

            }
        }


        return sb.toString();
    }
}
