import java.util.Arrays;
import java.util.HashMap;

public class arrayroatet {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        int k=2;
        String s="aabbbc";
        //System.out.println(rota);


       // revere(a,0,d-1);
        //revere(a,d,a.length-1);
       // revere(a,0,a.length-1);
        //System.out.println(Arrays.toString(a));
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if (map.containsKey(ch)){
                int count=map.get(ch);
                count++;
                map.replace(ch,count);
            }
            else {
                map.put(ch,1);
            }

        }
        for(Character key:map.keySet()){
            System.out.print(key+""+map.get(key));
        }

    }
    public static void revere(int[] a,int s,int e) {
        int start = s;
        int end = e;
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    public int rotate(int[] a,int k){
        int n=a.length;
        k=k%n;
        revere(a,0,n-1);
        revere(a,0,k-1);
        revere(a,k,n-1);
        return Integer.parseInt(Arrays.toString(a));



    }



}