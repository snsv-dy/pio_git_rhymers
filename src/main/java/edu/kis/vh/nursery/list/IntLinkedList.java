package edu.kis.vh.nursery.list;

class Node {

	public final int value;
	public Node prev, next;

	public Node(int i) {
		value = i;
	}

}

public class IntLinkedList {

	private Node last;
	private int i;
	public static final int IF_EMPTY = -1;


	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return IF_EMPTY;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return IF_EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
