public class PackagingWorker extends Worker {
    public Chair performAction(Chair chair) {
        super.performAction(chair);
        chair.packageProduct();
        return chair;
    }
}
