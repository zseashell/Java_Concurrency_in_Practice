package chap1;

public class Sequence {

    private int value;

    public synchronized int getNext() {
        return value++;
    }

}
