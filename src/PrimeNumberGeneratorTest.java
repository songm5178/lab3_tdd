import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * TODO Put here a description of what this class does.
 *
 * @author songm. Created Mar 24, 2015.
 */
public class PrimeNumberGeneratorTest {

	private List<Integer> list(Integer... integers) {
		return Arrays.asList(integers);
	}

	@Test
	public void testCaseFor1() {
		assertEquals(list(), PrimeNumberGenerator.generate(1));
	}

	@Test
	public void testCaseFor2() {
		assertEquals(list(), PrimeNumberGenerator.generate(2));
	}

	@Test
	public void testCaseFor3() {
		assertEquals(list(2), PrimeNumberGenerator.generate(3));
	}

	@Test
	public void testCaseFor5() {
		assertEquals(list(2, 3), PrimeNumberGenerator.generate(5));
	}

	@Test
	public void testCaseFor7() {
		assertEquals(list(2, 3, 5), PrimeNumberGenerator.generate(7));
	}

	@Test
	public void testCaseFor13() {
		assertEquals(list(2, 3, 5, 7, 11), PrimeNumberGenerator.generate(13));
	}

	@Test
	public void testCaseFor14() {
		assertEquals(list(2, 3, 5, 7, 11, 13),
				PrimeNumberGenerator.generate(14));
	}

	@Test
	public void testCaseFor32() {
		assertEquals(list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31),
				PrimeNumberGenerator.generate(32));
	}
}
