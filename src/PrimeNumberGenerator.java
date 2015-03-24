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
		int candidate = 2;
		while (i > 1) {
			for (; i % candidate == 0; i /= candidate) {
				primes.add(candidate);

			}
			candidate++;
		}
		if (i > 1) {
			primes.add(i);
		}
		return primes;
	}
}
