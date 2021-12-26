package Project01.facade;

public class CookServant extends CastleServant{
    public CookServant() {
        super("Cook Servant");
    }

    @Override
    public void work(String name) {
        System.out.println(name + " creates another delicious meal today.");
    }
}
