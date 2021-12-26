package Project01.facade;

import java.util.Collection;
import java.util.List;

public class CastleServantsFacade {

    private List<CastleServant> servants;

    public CastleServantsFacade(){
        servants = List.of(new MaidServant(),new CookServant(),new KnightServant());
    }

    private static void makeActions(Collection<CastleServant> servants,
                                    Action[] actions) {
        servants.forEach(servant -> servant.actionOfServant(actions));
    }

    public void startNewDay() {
        makeActions(servants, new Action[]{Action.WAKE_UP, Action.GO_TO_CASTLE});
    }

    public void workAtTheCastle() {
        makeActions(servants,  new Action[]{Action.WORK});
    }

    public void endDay() {
        makeActions(servants, new Action[]{Action.GO_HOME, Action.SLEEP});
    }
}
