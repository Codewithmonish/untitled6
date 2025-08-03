public class task24 {
    public static void main(String[] args) {
        int i=7;
       // System.out.println(i);
          //boxing
        Integer obj1=i;   //autoboxing
        int val=obj1.intValue(); //unboxing
        int val2=obj1;  //auto-unbox
        System.out.println("value" +val);
    }
}
