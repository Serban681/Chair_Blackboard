// the worker is bassically the knowledge source
public abstract class Worker {
    private boolean isBusy = false;

    public void setWorkerFree() {
        isBusy = false;
    }

    public boolean canWorkOnChair() {
        if(isBusy) {
            return false;
        }

        return true;
    }

    public Chair performAction(Chair chair) {
        isBusy = true;
        return chair;
    }
}
