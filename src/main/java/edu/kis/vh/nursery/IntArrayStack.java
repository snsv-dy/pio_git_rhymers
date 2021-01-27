package edu.kis.vh.nursery;

public class IntArrayStack {
    public int getTotal() {
        return total;
    }

    public static final int IF_EMPTY = -1;
    public static final int INITIAL = -1;
    public static final int CAPACITY = 12;
    private final int[] numbers = new int[CAPACITY];
    private int total = INITIAL;

    public void countIn(int in) {

        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }
}