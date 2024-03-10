public class StabilizerBarWorker extends Worker {
    public Chair performAction(Chair chair) {
        super.performAction(chair);
        chair.assembleStabilizerBar();
        return chair;
    }
}
