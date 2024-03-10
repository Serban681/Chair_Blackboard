import java.util.ArrayList;

// the factory is the blackboard
public class Workbench {
    private static Workbench instance = null;
    private ArrayList<Chair> freeChairs = new ArrayList<Chair>();
    private ArrayList<Chair> workedOnChairs = new ArrayList<Chair>();
    private ArrayList<Chair> packagedChairs = new ArrayList<Chair>();

    public void planNewChair(ChairType chairType) {
        if(chairType == ChairType.BASIC_CHAIR) {
            freeChairs.add(new BasicChair());
        }
    }

    public static Workbench getInstance() {
        if(instance == null) {
            instance = new Workbench();
        }

        return instance;
    }

    public ArrayList<Chair> getFreeChairs() {
        return freeChairs;
    }

    public void setChairBusy(Chair chair) {
        freeChairs.remove(chair);
        workedOnChairs.add(chair);
    }

    public void setChairsAvailable() {
        for(Chair chair : workedOnChairs) {
            if(chair.isPackaged()) {
                workedOnChairs.remove(chair);
                packagedChairs.add(chair);
            } else {
                workedOnChairs.remove(chair);
                freeChairs.add(chair);
            }
        }
    }

    public ArrayList<Chair> getProductionChairs() {
        return packagedChairs;
    }
}
