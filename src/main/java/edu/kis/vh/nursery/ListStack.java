package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class ListStack extends IntArrayStack{
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
    public boolean callCheck() {
        return list.isEmpty();
    }

    @Override
    public boolean isFull() {
        return list.isFull();
    }

    @Override
    protected int peekaboo() {
        return list.top();
    }

    @Override
    public int countOut() {
        total--;
        return list.pop();
    }
}
