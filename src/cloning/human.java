package cloning;

public class human {
    int age;
    String name;

    public human(int age,String name){
        this.age=age;
        this.name=name;
    }
    public human(human other){
        this.age=other.age;
        this.name=other.name;
    }

    public static void main(String[] args) {
        human monish=new human(12,"jack");
        human jack=new human(monish);
        System.out.println(jack);
    }

}
