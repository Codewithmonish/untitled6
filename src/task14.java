class myThread extends Thread{
    public void run() {
        while (true) {
            System.out.println("my thread is running");
            System.out.println("i am happy");
        }
    }
}
class myThread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("my thread is running");
            System.out.println("i am happy");
        }
    }
}











public class task14 {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}


