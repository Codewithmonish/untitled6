import java.util.HashMap;
import java.util.Map;

public class reveersewords {
    public static void main(String[] args) {
       // String s="hello   world";
        //System.out.println(reverse(s));
        int[] n={1,2,3,4,5};
        revarr(n);
        for (int num:n){
            System.out.print(num +" ");

        }
        //System.out.println(ans);
        String s="swiss";
        System.out.println(nonrep(s));
        String si="helloworld";
        System.out.println(reverser(si));

    }
    public static String reverse(String s){
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            sb.append(words[i]);
            sb.append(" ");

        }
        return sb.toString().trim();
    }
    public static int secondlargest(int[] n){
        int max=0;
        int min=0;
        for (int num:n){
            if (num>max){
                min=max;
                max=num;
            } else if (num>min) {
                min=num;

            }
        }
        return min;
    }
    public static Character nonrep(String s){
        //int[] count=new int[256];
        Map<Character,Integer> map=new HashMap<>();
        for (char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return null;
    }
    public static String reverser(String s){
        String words="";
        for (int i = s.length()-1; i >=0 ; i--) {
            words +=s.charAt(i);


        }
        return words;
    }
    public static void revarr(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int tem=arr[start];
            arr[start]=arr[end];
            arr[end]=tem;
            start++;
            end--;

        }
    }
}
