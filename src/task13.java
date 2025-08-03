
interface parentclass{
    void meth1();
    void meth2();

    void meth3();
}
interface childclass extends parentclass{
    void meth4();
}
class superclass implements childclass{

    @Override
    public void meth3() {
        System.out.println("method 3");

    }

    @Override
    public void meth4() {
        System.out.println("method 4");

    }

    @Override
    public void meth1() {
        System.out.println("method 1");

    }

    @Override
    public void meth2() {
        System.out.println("method 2");

    }
}




public class task13 {
    public static void main(String[] args) {
        superclass ms=new superclass();
        ms.meth1();
        ms.meth2();
        ms.meth3();
        ms.meth4();
    }


}
