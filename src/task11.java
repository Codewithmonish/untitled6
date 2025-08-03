
interface camera{
    void takesnap();
    void recodard();
}
interface wife{
    String[] getnetworks();
    void connecet(String networks);


}
class mycellphone {
    void phonenumber(int cellnumber){
        System.out.println("calling phone...."+cellnumber);
    }
}
class myphone extends mycellphone implements camera,wife{
    public void takesnap(){
        System.out.println("taking snape");
    }
    public void recodard(){
        System.out.println("taking video");
    }
    public String[] getnetworks(){
        System.out.println("getting...");
        String[] networklist={"moni","jack"};
        return networklist;
    }

    @Override
    public void connecet(String networks) {
        System.out.println("connecting networks..");

    }
}



public class task11 {
    public static void main(String[] args) {
        myphone ms=new myphone();
        String[] arr= ms.getnetworks();
        for ( String item:arr){
            System.out.println(item);

        }

    }
}
