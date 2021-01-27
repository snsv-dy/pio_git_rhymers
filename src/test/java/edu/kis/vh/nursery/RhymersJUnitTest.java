package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer(new IntArrayStack());
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testHanoi(){
		HanoiRhymer rhymer = new HanoiRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int value1 = 5, value2 = 4;
		rhymer.countIn(value1);
		rhymer.countIn(value2);

		Assert.assertEquals(value2, rhymer.countOut());
		Assert.assertEquals(value1, rhymer.countOut());
	}


	@Test
	public void testFIFO(){
		FIFORhymer rhymer = new FIFORhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int value1 = 5, value2 = 2;
		rhymer.countIn(value1);
		rhymer.countIn(value2);

		Assert.assertEquals(value1, rhymer.countOut());
		Assert.assertEquals(value2, rhymer.countOut());
	}

	@Test
	public void listTest(){
		IntLinkedList list = new IntLinkedList();
		Assert.assertEquals(true, list.isEmpty());

		int[] values = {1, 2, 3};
		Arrays.stream(values).forEach(e -> list.push(e));

		Assert.assertEquals(values[2], list.top());
		Assert.assertEquals(false, list.isEmpty());

		list.pop();
		Assert.assertEquals(values[1], list.top());
	}
}

