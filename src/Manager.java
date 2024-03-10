import java.util.ArrayList;

// The manager is the control
public class Manager {
    private ArrayList<Worker> workers = new ArrayList<Worker>();

    private int time = 0; // time has no significant importance here. It's just symbolic
        // maybe we can print it to see how much it took the algorithm to finish

    private Workbench workbench = Workbench.getInstance();

    public void executeProgram() {
        if(workbench.getFreeChairs().size() > 0) {
            loopChairs();
            workbench.setChairsAvailable();
            setWorkersAvailable();
            time++;
        }
    }

    public void addWorker(Role role) {
        switch (role) {
            case CUT_SEAT:
                workers.add(new SeatWorker());
                break;
            case ASSEMBLE_BACKREST:
                workers.add(new BackrestWorker());
                break;
            case ASSEMBLE_FEET:
                workers.add(new FeetWorker());
                break;
            case ASSEMBLE_STABILIZER_BAR:
                workers.add(new StabilizerBarWorker());
                break;
            case PACKAGE_CHAIR:
                workers.add(new PackagingWorker());
                break;
            default:
                System.out.println("Invalid role");
        }
    }

    private void loopChairs() {
        for(Chair chair : workbench.getFreeChairs()) {
            inspectChair(chair);
        }
    }

    private void setWorkersAvailable() {
        for(Worker worker : workers) {
            worker.setWorkerFree();
        }
    }

    private void inspectChair(Chair chair) {
        if(!chair.hasSeat) {
            assignSeatWorker(chair);
        }

        if(!chair.hasBackrest) {
            assignBackrestWorker(chair);
        }

        if(!chair.hasFeet) {
            assignFeetWorker(chair);
        }

        if(!chair.hasStabilizerBar) {
            assignStabilizerBarWorker(chair);
        }

        if(!chair.isPackaged) {
            assignPackagingWorker(chair);
        }
    }

    private Chair assignSeatWorker(Chair chair) {
        for(Worker worker : workers) {
            if(worker instanceof SeatWorker && worker.canWorkOnChair()) {
                workbench.setChairBusy(chair);
                return worker.performAction(chair);
            }
        }

        return null;
    }

    private Chair assignBackrestWorker(Chair chair) {
        for(Worker worker : workers) {
            if(worker instanceof BackrestWorker && worker.canWorkOnChair()) {
                workbench.setChairBusy(chair);
                return worker.performAction(chair);
            }
        }

        return null;
    }

    private Chair assignFeetWorker(Chair chair) {
        for(Worker worker : workers) {
            if(worker instanceof FeetWorker && worker.canWorkOnChair()) {
                workbench.setChairBusy(chair);
                return worker.performAction(chair);
            }
        }

        return null;
    }

    private Chair assignStabilizerBarWorker(Chair chair) {
        for(Worker worker : workers) {
            if(worker instanceof StabilizerBarWorker && worker.canWorkOnChair()) {
                workbench.setChairBusy(chair);
                return worker.performAction(chair);
            }
        }

        return null;
    }

    private Chair assignPackagingWorker(Chair chair) {

        for(Worker worker : workers) {
            if(worker instanceof PackagingWorker && worker.canWorkOnChair()) {
                workbench.setChairBusy(chair);
                return worker.performAction(chair);
            }
        }

        return null;
    }
}
