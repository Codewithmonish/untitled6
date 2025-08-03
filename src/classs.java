import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class classs {
    public static void main(String[] args) {
        Students monish =new Students(134,"melben",99.0f);
     //   student.rollno=89;
     //   student.name="monish";
     //   student.nmarks=100.0f;
        monish.changename("monijack");
        monish.greetings();

        System.out.println(monish.rollno);
        System.out.println(monish.name);
        System.out.println(monish.name);

    }

}
class Students{
    int rollno;
    String name;
    float nmarks;

    void greetings(){
        System.out.println("my name is" + this.name);
    }
    void changename(String name){
        this.name=name;

    }


    Students(int rollno, String name,float nmarks) {
        this.rollno=rollno;
        this.name=name;
        this.nmarks=nmarks;
    }
}
