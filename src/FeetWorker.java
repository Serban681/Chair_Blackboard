public class FeetWorker extends Worker {
    public Chair performAction(Chair chair) {
        super.performAction(chair);
        chair.assembleFeet();
        return chair;
    }
}
