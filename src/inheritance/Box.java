package inheritance;

public class Box {
    public static void main(String[] args) {
        inbox box=new inbox(1.0,7.0,8.0);
        System.out.println(box.h +" " +box.l +" "+ box.w);
    }

}
class inbox{
    double h;
    double w;
    double l;

    inbox(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
     inbox(double side){
        this.h=side;
        this.w=side;
        this.l=side;
     }
     inbox(double l,double h,double w){
        this.h=h;
        this.l=l;
        this.w=w;
     }
     public void display(){
         System.out.println("running");
     }

}
class boxweight extends inbox{
    double weight;
     public boxweight(){
         this.weight=-1;
     }
}