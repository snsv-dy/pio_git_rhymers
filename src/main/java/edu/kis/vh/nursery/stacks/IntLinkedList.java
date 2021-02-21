package edu.kis.vh.nursery.stacks;

class Node {

	public final int value;
	public Node prev, next;

	public Node(int i) {
		value = i;
	}

}

/**
 * Prosta lista z dowiązaniami. Operująca na typach int.
 */
public class IntLinkedList implements ArrayStack {


	private Node last = null;
	private int i;
	private int total = 0;
	public static final int IF_EMPTY = -1;


	/**
	 * Dodaje element do listy.
	 * @param i liczba wstawiona na koniec listy
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/**
	 * Sprawdza czy lista jest pusta.
	 * @return wartość logiczna testu.
	 */
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public void countIn(int in) {
		this.push(in);
		total++;
	}

	/**
	 * Sprawdza czy lista jest pełna.
	 * @return wartość logiczna testu
	 */
	public boolean isFull() {
		return false;
	}

	@Override
	public int countOut() {
		int out = this.pop();
		total--;
		return out;
	}

	@Override
	public int peekaboo() {
		return this.top();
	}

	/**
	 * Pokazuje jaka jest wartość na końcu listy bez usuwania go z listy.
	 * @return wartość elementu na końcu listy.
	 */
	public int top() {
		if (isEmpty())
			return IF_EMPTY;
		return last.value;
	}

	/**
	 * Usuwa element z listy i zwraca go.
	 * @return wartość elementu na końcu listy.
	 */
	public int pop() {
		if (isEmpty())
			return IF_EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

	/**
	 * Zwraca ostatni węzeł listy.
	 * @return Obiekt Node z końca listy;
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * Ustawia ostatni element listy;
	 * @param last element który ma być ostatnim.
	 */
	public void setLast(Node last) {
		this.last = last;
	}

	/**
	 * Zwraca i.
	 * @return i
	 */
	public int getI() {
		return i;
	}

	/**
	 * Ustawia i.
	 * @param i
	 */
	public void setI(int i) {
		this.i = i;
	}
}
