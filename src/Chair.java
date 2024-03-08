public abstract class Chair {
    private boolean isBeingWorkedOn = false;
    protected boolean hasSeat = false;
    protected boolean hasBackrest = false;
    protected boolean hasFeet = false;
    protected boolean hasStabilizerBar = false;
    protected boolean isAssembled = false;
    protected boolean isPackaged = false;

    public boolean canBeWorkedOn() {
        return isBeingWorkedOn;
    }

    public void modifyChair(Role workerRole) {
        isBeingWorkedOn = true;

        switch (workerRole) {
            case CUT_SEAT:
                if(hasSeat) {
                    throw new Error("Cannot cut seat more than once.");
                }
                cutSeat();
                break;
            case ASSEMBLE_BACKREST:
                if(!hasSeat) {
                    throw new Error("Cannot assemble backrest without seat.");
                }
                if(hasBackrest) {
                    throw new Error("Cannot assemble backrest more than once.");
                }
                assembleBackrest();
                break;
            case ASSEMBLE_FEET:
                if(!hasSeat) {
                    throw new Error("Cannot assemble backrest without seat.");
                }
                if(hasFeet) {
                    throw new Error("Cannot assemble feet more than once.");
                }
                assembleFeet();
                break;
            case ASSEMBLE_STABILIZER_BAR:
                if(!hasFeet) {
                    throw new Error("Cannot assemble stabilizer bar without feet.");
                }
                if(hasStabilizerBar) {
                    throw new Error("Cannot assemble stabilizer bar more than once.");
                }
                assembleStabilizerBar();
                break;
            case PACKAGE_CHAIR:
                if(!isAssembled) {
                    throw new Error("Cannot package chair without all parts assembled.");
                }
                if(isPackaged) {
                    throw new Error("Cannot package chair more than once.");
                }
                packageProduct();
                break;
            default:
                System.out.println("Invalid role");
        }
        checkIfAssembled();

        isBeingWorkedOn = false;
    }

    public boolean hasSeat() {
        return hasSeat;
    }

    public boolean hasBackrest() {
        return hasBackrest;
    }

    public boolean hasFeet() {
        return hasFeet;
    }

    public boolean hasStabilizerBar() {
        return hasStabilizerBar;
    }

    public boolean isPackaged() {
        return isPackaged;
    }

    protected abstract void cutSeat();

    protected abstract void assembleBackrest();

    protected abstract void assembleFeet();

    protected abstract void assembleStabilizerBar();

    protected abstract void packageProduct();

    protected abstract void checkIfAssembled();
}
