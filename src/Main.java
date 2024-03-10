public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.addWorker(Role.CUT_SEAT);
        manager.addWorker(Role.ASSEMBLE_BACKREST);
        manager.addWorker(Role.ASSEMBLE_FEET);
        manager.addWorker(Role.ASSEMBLE_STABILIZER_BAR);
        manager.addWorker(Role.PACKAGE_CHAIR);

        manager.addWorker(Role.CUT_SEAT);
        manager.addWorker(Role.ASSEMBLE_BACKREST);
        manager.addWorker(Role.ASSEMBLE_FEET);
        manager.addWorker(Role.ASSEMBLE_STABILIZER_BAR);
        manager.addWorker(Role.PACKAGE_CHAIR);

        manager.addWorker(Role.CUT_SEAT);
        manager.addWorker(Role.ASSEMBLE_BACKREST);
        manager.addWorker(Role.ASSEMBLE_FEET);
        manager.addWorker(Role.ASSEMBLE_STABILIZER_BAR);
        manager.addWorker(Role.PACKAGE_CHAIR);

        Workbench workbench = Workbench.getInstance();

        workbench.planNewChair(ChairType.BASIC_CHAIR);
        workbench.planNewChair(ChairType.BASIC_CHAIR);
        workbench.planNewChair(ChairType.BASIC_CHAIR);
        workbench.planNewChair(ChairType.BASIC_CHAIR);

        manager.executeProgram();
    }
}