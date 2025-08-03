public class objectdemo {

    int num;

    public objectdemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        objectdemo obj=new objectdemo(345);
        objectdemo obj1=new objectdemo(345);
        if (obj.equals(obj1)){
            System.out.println("equals");
        }
       // System.out.println(obj.hashCode());
    }
}
