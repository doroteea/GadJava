package Project01.facade;

public class MaidServant extends CastleServant{
    public MaidServant() {
        super("Maid Servant");
    }

    @Override
    public void work(String name) {
        System.out.println(name + " cleans the castle.");
    }
}
