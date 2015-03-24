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

	@Test
	public void test() {
		assertEquals(list(), PrimeNumberGenerator.generate(1));
	}

	private List<Integer> list(Integer... integers) {
		return Arrays.asList(integers);
	}

}
