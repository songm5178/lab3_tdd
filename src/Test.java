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
	private List<Integer> list(Integer ...integers) {
		return Arrays.asList(integers);
	}

	@org.junit.Test
	public void testForEmpty() {

		assertEquals(list(), PrimeNumberGenerator.generate(1));
	}
	
	@org.junit.Test
	public void testForTwo() {
		assertEquals(list(2), PrimeNumberGenerator.generate(2));
	}
	

}
