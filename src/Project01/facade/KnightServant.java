package Project01.facade;

public class KnightServant extends CastleServant {
    public KnightServant() {
        super("Knight servant");
    }

    @Override
    public void work(String name) {
        System.out.println(name + " defends the castle against unwanted people.");
    }
}
