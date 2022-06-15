package cinema;

public enum State {
    CHOOSINGACTION(1),
    PRINTINGSEAT(2),
    BUYINGTICKET(3),
    CHECKINGSTATS(4),
    EXIT(0);

    int stateVal;

    State(int stateVal) {
        this.stateVal = stateVal;
    }

    public int getStateVal() {
        return this.stateVal;
    }
}
