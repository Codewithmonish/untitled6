public class lap extends desktop{
    public lap(String brand) {
        super(brand);
        System.out.println(brand);
    }
    public lap(){
        System.out.println("charge on ");
    }

    public static void main(String[] args) {
        lap lenova=new lap();
        lap lap2=new lap("mac");
    }
    
}
