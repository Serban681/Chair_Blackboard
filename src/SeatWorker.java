public class SeatWorker extends Worker {
    public Chair performAction(Chair chair) {
        super.performAction(chair);
        chair.cutSeat();
        return chair;
    }
}
