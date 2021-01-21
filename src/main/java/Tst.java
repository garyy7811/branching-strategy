public class Tst {

    public Tst(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }


    private void increaseByAdding() {
        value += 22;
    }

    private void increaseByTiming() {
        value *= 10;
    }

    public void process() {
        increaseByAdding();
        increaseByTiming();
    }

}
