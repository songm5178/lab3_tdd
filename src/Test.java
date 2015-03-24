import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

/**
 * TODO Put here a description of what this class does.
 *
 * @author songm. Created Mar 24, 2015.
 */
public class Test {

	@org.junit.Test
	public void test() {
		PrimeFactorization g = new PrimeFactorization();

	}

	private List<Integer> list(Integer... integers) {
		return Arrays.asList(integers);
	}

	@org.junit.Test
	public void testForEmpty() {

		assertEquals(list(), PrimeFactorization.generate(1));
	}

	@org.junit.Test
	public void testForTwo() {
		assertEquals(list(2), PrimeFactorization.generate(2));
	}

	@org.junit.Test
	public void testForThree() {
		assertEquals(list(3), PrimeFactorization.generate(3));
	}

	@org.junit.Test
	public void testForFour() {
		assertEquals(list(2, 2), PrimeFactorization.generate(4));
	}

	@org.junit.Test
	public void testForSix() {
		assertEquals(list(2, 3), PrimeFactorization.generate(6));
	}

	@org.junit.Test
	public void testForEight() {
		assertEquals(list(2, 2, 2), PrimeFactorization.generate(8));
	}

	@org.junit.Test
	public void testForNine() {
		assertEquals(list(3, 3), PrimeFactorization.generate(9));
	}

	@org.junit.Test
	public void testForBigNumber() {
		assertEquals(list(5, 7, 7, 1327), PrimeFactorization.generate(325115));
	}
}
