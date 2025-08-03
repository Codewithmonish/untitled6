import java.util.*;

public class longestconsequtive {
    public static void main(String[] args) {
        //int[] nums={102,4,100,1,101,3,2};
        //int ans=seq(nums);
        //System.out.println(ans);
        String n="a2b3c1";
        String a=decode(n);
        System.out.println(a);
       // int[] num = {1, 2, 3, -2, 5};
        //int k = 5;
        //List<List<Integer>> ans = sub(num, k);
       // for (List<Integer> sub : ans) {


           // System.out.println(sub);
       // }


    }

    public static int seq(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n : nums) {
            set.add(n);
        }
        int longest = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentnum = num;
                int currentstraek = 1;
                while (set.contains(currentnum + 1)) {
                    currentnum += 1;
                    currentstraek += 1;
                }
                longest = Math.max(longest, currentstraek);
            }
        }
        return longest;
    }

    public static String decode(String n) {
        StringBuilder sb = new StringBuilder();

        int i=0;
        while (i<n.length()){
            char ch=n.charAt(i);
            i++;
            StringBuilder count =new StringBuilder();
            while (i<n.length() && Character.isDigit(i)){
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

    public static List<List<Integer>> sub(int[] n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        int sum=0;
        map.put(0,new ArrayList<>(List.of(1)));
        for (int i = 0; i < n.length; i++) {
            sum+=n[i];
            if (map.containsKey(sum-k)){
                for(int start:map.get(sum-k)) {
                    List<Integer> sd=new ArrayList<>();
                    for (int j = start+1; j <=i ; j++) {
                        sd.add(n[j]);

                    }
                    result.add(sd);

                }
            }
            map.computeIfAbsent(sum, x -> new ArrayList<>()).add(i);

        }
        return result;

    }


}
