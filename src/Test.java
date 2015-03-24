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
		PrimeNumberGenerator g = new PrimeNumberGenerator();

	}

	@org.junit.Test
	public void testForEmpty() {

		assertEquals(list(), PrimeNumberGenerator.generate(1));
	}

	private List<Integer> list() {
		return Arrays.asList();
	}

}
