public class test11 {
    public static void main(String[] args) {
        String num="@mon*";
        System.out.println(palindrome(num));

    }
    public static String reverse(String s){
        char[] ch=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while (l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;

        }
        return new String(ch);
    }
    public static boolean palindrome(String num){

        int stat=0;
        int end=num.length()-1;
        while (stat<=end){
            if (!Character.isAlphabetic(num.charAt(stat))){
                stat++;
            }
            else if (!Character.isAlphabetic(num.charAt(end))){
                end--;
            }
            else if (num.charAt(stat)!=num.charAt(end)) {
                return false;

            }
            else {
                stat++;
                end--;
            }


        }
        return true;

    }

}
