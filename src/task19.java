public class task19 {
    public static void main(String[] args) {
        String s="B..BB..BBB";
        char c='B';
        int maxcount=0;
        int count=0;
        for (char ch : s.toCharArray()){
            if (ch=='B'){
                count++;
            }
            else {
                maxcount=count;

            }
        }
        System.out.println(maxcount);
    }
}
