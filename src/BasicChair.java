public class BasicChair extends Chair {
    @Override
    protected void cutSeat() {
        System.out.println("Cutting seat");
        hasSeat = true;
    }

    @Override
    protected void assembleBackrest() {
        System.out.println("Assembling backrest");
        hasBackrest = true;
    }

    @Override
    protected void assembleFeet() {
        System.out.println("Assembling feet");
        hasFeet = true;
    }

    @Override
    protected void assembleStabilizerBar() {
        System.out.println("Assembling stabilizer bar");
        hasStabilizerBar = true;
    }

    @Override
    protected void packageProduct() {
        System.out.println("A packaged Basic Chair");
        isPackaged = true;
    }

    @Override
    protected void checkIfAssembled() {
        if(hasSeat && hasBackrest && hasFeet && hasStabilizerBar) {
            isAssembled = true;
        }
    }
}
