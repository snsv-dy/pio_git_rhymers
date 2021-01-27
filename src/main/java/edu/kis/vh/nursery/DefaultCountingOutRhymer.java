package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
	ArrayStack stack;

	public int getTotal() {
		return stack.getTotal();
	}

	public void countIn(int in) {
		stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}

	public DefaultCountingOutRhymer() {
//		 stack = new IntArrayStack();
		 stack = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(ArrayStack stack) {
		this.stack = stack;
	}
}

// alt + ← oraz alt + →, zmieniają mi aktualnie wyświetlany plik.
