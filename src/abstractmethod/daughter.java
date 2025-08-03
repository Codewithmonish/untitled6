package abstractmethod;

public class daughter extends parent {
    void carear() {
        System.out.println("I am a doctor" );
    }

    @Override
    void partner() {
        System.out.println("I love iron man");
    }
}
