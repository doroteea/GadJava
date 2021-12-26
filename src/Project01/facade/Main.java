package Project01.facade;

public class Main {

    public static void main(String[] args) {
        CastleServantsFacade facade = new CastleServantsFacade();
        System.out.println("In the morning:");
        facade.startNewDay();
        System.out.println("\nThe day:");
        facade.workAtTheCastle();
        System.out.println("\nAfter work: ");
        facade.endDay();
    }

}
