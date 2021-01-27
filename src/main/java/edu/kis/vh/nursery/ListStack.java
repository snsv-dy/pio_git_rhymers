package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntArrayStack;
import edu.kis.vh.nursery.stacks.IntLinkedList;

public class ListStack extends IntArrayStack {
    IntLinkedList list = new IntLinkedList();
    int total = 0;

    @Override
    public int getTotal() {
        return total;
    }

    @Override
    public void countIn(int in) {
        list.push(in);
        total++;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return list.isFull();
    }

    @Override
    public int peekaboo() {
        return list.top();
    }

    @Override
    public int countOut() {
        total--;
        return list.pop();
    }
}
