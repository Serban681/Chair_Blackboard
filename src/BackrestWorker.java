public class BackrestWorker extends Worker {
    public Chair performAction(Chair chair) {
        super.performAction(chair);
        chair.assembleBackrest();
        return chair;
    }
}
