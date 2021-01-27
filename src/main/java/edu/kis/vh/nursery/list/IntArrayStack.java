package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.ArrayStack;

public class IntArrayStack implements ArrayStack {
    @Override
    public int getTotal() {
        return total;
    }

    public static final int IF_EMPTY = -1;
    public static final int INITIAL = -1;
    public static final int CAPACITY = 12;
    private final int[] numbers = new int[CAPACITY];
    private int total = INITIAL;

    @Override
    public void countIn(int in) {

        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == INITIAL;
    }

    @Override
    public boolean isFull() {
        return total == CAPACITY-1;
    }

    public int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }
}
