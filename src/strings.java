import java.util.*;

public class strings {
    public static void main(String[] args) {
        float a=453.123f;
       // System.out.printf("formatted %.2f",a);
        //String s="AABABCC";
       // int k=2;
       // int ans=replacement(s,k);
        //out.printf(ans);
       // System.out.println(ans);;
         String t="ball";
        Map<Character,Integer> rsult=stringcomp(t);
        for (Map.Entry<Character,Integer> entry:rsult.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }
        //String str="a1b2c34c3b2cb3a1d";
       // String ans=removedup(str);
        //System.out.println(ans);
        //int ans1=countdup(n);
       // System.out.println(ans1);
        //String[] strs={"eat","tea","bat"};
        //List<List<String>> ans=groupanagram(strs);
        //System.out.println(ans);
        String input="aeeeiiiioooauuuaeiou";
        //String ans=extraxtrep(input);
        //System.out.println(ans);

    }
    public static int replacement(String s, int k){
        int[] freq=new int[26];
        int left=0;
        int maxwindow=0;
        int mazfre=0;
        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right)-'A']++;
            mazfre=Math.max(mazfre,freq[s.charAt(right)-'A']);
            int windowlength=right-left+1;
            if (windowlength-mazfre>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowlength=right-left+1;
            maxwindow=Math.max(windowlength,maxwindow);


        }
        return maxwindow;
    }
    public static Map<Character,Integer> countdup(String n){
        n=n.toLowerCase();
        Map<Character,Integer> freq=new HashMap<>();
        Map<Character,Integer> dup=new HashMap<>();
        for(char ch:n.toCharArray()){
            if(ch!=' '){
                freq.put(ch,freq.getOrDefault(ch,0)+1);
            }
        }
        //for (Map.Entry<Character,Integer>)
        for (Map.Entry<Character,Integer> entry:freq.entrySet()){
            if ((entry.getValue()>1)){
                dup.put(entry.getKey(),entry.getValue());
            }
        }
        return dup;

    }
    public static Map<Character,Integer> stringcomp(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (map.containsKey(ch)){
                int count=map.get(ch);
                count++;
                map.replace(ch,count);
               // map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else {
                map.put(ch,1);
            }
            for (Character key:map.keySet()){
                map.put(key,map.get(key));
            }

        }
        return map;
    }
    public static String removedup(String str){
       Set<Character> set=new LinkedHashSet<>();  //remove dup maitains originl
       for (char ch:str.toCharArray()){
           set.add(ch);   //mo
       }
       StringBuilder result=new StringBuilder();
       for (char s:set){
           result.append(s);
       }
       return result.toString();
    }
    public static List<List<String>> groupanagram(String[] strs){

        Map<String,List<String>> map=new HashMap<>();
        for (String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String s1=String.valueOf(ch);
            if (!map.containsKey(s1)){
                map.put(s1,new ArrayList<>());
            }
            map.get(s1).add(s);


        }
        return new ArrayList<>(map.values());

    }
    public static String extraxtrep(String input){
       //String vowels="aeiou";
        int max=0;
        int start=0;
        int left=0;
        int[] lastindex=new int[256];
        for (int i = 0; i < 256; i++) {
            lastindex[i]=-1;

        }
        for (int right = 0; right < input.length(); right++) {
            char ch=input.charAt(right);
            if (lastindex[ch]>=left){
                left=lastindex[ch]+1;
            }
            lastindex[ch]=right;
            int length=right-left+1;
            if (length>max){
                max=length;
                start=left;
            }

        }
        return input.substring(start,start+max);


    }


}
