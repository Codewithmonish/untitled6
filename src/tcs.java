import java.util.*;

public class tcs {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     int[] arr=new int[n];
     for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

     }
     int[] ans=rot(arr,k);
     for (int num:ans){
         System.out.println(num+" ");
     }







    }

    private static boolean vowels(char c) {
        if (c=='a' || c=='e'||c=='i' ||c=='u'){
            return true;
        }
        return false;
    }

    //minimum
    public static int min(int[] num){
        int min=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]<min){
                min=num[i];
            }

        }
        return min;
    }
    //reverse
    public static int[] reverse(int[] num){
        int start=0;
        int end=num.length-1;
        while (start<end){
            int t=num[start];
            num[start]=num[end];
            num[end]=t;
            start++;
            end--;
        }
        return num;
    }
    //find freq
    public static HashMap<Integer, Integer> freq(int[] num){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])){
                map.put(num[i],map.getOrDefault(num[i],0)+1);
            }
            else {
                map.put(num[i],1);
            }

        }
        return map;
    }
    //rearrange
    public static void rearrange(int[] num){
        Arrays.sort(num);
        int n=num.length;
        int[] ans=new int[n];
        int mid=n/2;
        for (int i = 0; i < mid; i++) {
            ans[i]=num[i];

        }
        int ind=mid;
        for (int i = n-1; i >=mid ; i--) {
            ans[ind++]=num[i];

        }
        for (int i = 0; i < n; i++) {
            num[i]=ans[i];

        }


    }
    //sum
    public static int sum(int[] num){
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];

        }
        return sum;
    }
    public static int[] rot(int[] num,int k){
        int n=num.length;
        k=k%num.length;
        rotate(num,0,n-1);
        rotate(num,0,k-1);
        rotate(num,k,n-1);
        return num;

    }
    public static void rotate(int[] num,int start,int end ){
       // start=0;
       // end=num.length-1;
        while (start<end){
            int t=num[start];
            num[start]=num[end];
            num[end]=t;
            start++;
            end--;
        }


    }
    public static int[] adding(int[] nums,int insertbeg,int insertend,int interval,int position){
        int[] ans=new int[nums.length+3];
        int ind=0;
        ans[ind++]=insertbeg;
        for (int num:nums){
            ans[ind++]=num;

        }
        for (int i = ans.length-2; i >=position-1; i--) {
            ans[i+1]=ans[i];

        }
        ans[position-1]=interval;
        ans[ans.length-1]=insertend;
        return ans;
    }
    public static Set<Integer> duplicates(int[] num){
        Set<Integer> st=new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            int ind=Math.abs(num[i])-1;
            if (num[ind]<0){
                st.add(ind+1);

            }
            num[ind]=num[ind]*-1;

        }
        return st;
    }
    public static Set<Integer> repeat(int[] num){
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new LinkedHashSet<>();
        for (int nums:num){
            map.put(nums,map.getOrDefault(nums,0)+1);

        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()>1){
                set.add(entry.getKey());
            }
        }
        return set;
    }
    public static List<int[]> sem(int[][] num){
        Map<Integer,Integer> map=new HashMap<>();
        List<int[]> list=new ArrayList<>();
        for (int[] pair:num){
            int a=pair[0];
            int b=pair[1];
            if (map.containsKey(b)&&map.get(b)==a){
                list.add(new int[]{a,b});
            }
            else {
                map.put(a,b);
            }

        }
        return list;
    }
    //sum of numbers in string
    public static  int sum(String s) {
        int sum = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }
        return sum;
    }
    //longest word
    public static String longest(String s){
        String[] words=s.split("\\s+");
        String longe=words[0];
        for (String c:words){
            if (c.length()<longe.length()){
                longe=c;
            }
        }
        return longe;
    }
    //length
    public static int length(String s){
        int count=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)!=' '){
                count++;
            }

            else {
                if(count>0){
                    return count;

                }


            }

        }
        return count;
    }
    public static boolean amrm(int num){
        int original=num;
        int cub=0;
        while (num>0){
            int rem=num%10;
            cub=cub+(rem*rem*rem);
            num=num/10;
        }
        return cub==original;
    }
    //ascii checker
    public static boolean ascii(String s){
        int[] freq=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            freq[c-'a']++;

        }
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            int expected=c-'a'+1;
            if (freq[c-'a']!=expected){
                return false;
            }

        }
        return true;
    }
}
