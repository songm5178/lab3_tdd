import java.util.ArrayList;
import java.util.List;

/**
 * TODO Put here a description of what this class does.
 *
 * @author songm. Created Mar 24, 2015.
 */
public class PrimeNumberGenerator {

	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (i % 2 == 0) {
			primes.add(2);
			i /= 2;
		}
		if (i > 1) {
			primes.add(i);
		}
		return primes;
	}
}
