
class parent {
    static char p = 'm';
    int age = 89;

    public void talk() {
        System.out.println("talking");

    }
}
class child extends parent{
    char d='f';
   final int age=18;

public void walk() {
    System.out.println("walking");
}

}






public class task18 {
    public static void main(String[] args) {

        System.out.println(parent.p);

        child ca=new child();


        System.out.println(ca.age);


    }
}
