public class mobileshop {
    int disc;
    static String name="iphone";
   public mobileshop(int pric,int disc){

       System.out.println(pric-disc);
   }
   public mobileshop(){
       this(1000,300);
       System.out.println("welcone");

   }

    public static void main(String[] args) {
       mobileshop mob=new mobileshop();
       mobileshop mob2=new mobileshop(1000,2000);


    }
}
