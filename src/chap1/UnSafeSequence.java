package chap1;

public class UnSafeSequence {

    private int value;

    /*
     * Not atomic operation
     * 1. read value
     * 2. value increment
     * 3. write value
     */
    public int getNext() {
        return value++;
    }

}
