import java.util.ArrayList;
import java.util.List;

/**
 * DONE Put here a description of what this class does.
 *
 * @author songm. Created Mar 24, 2015.
 */
public class PrimeNumberGenerator {
	public static List<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int candidate = 2; candidate < i; candidate++) {

			if (PrimeNumberChecker.validate(candidate)) {
				primes.add(candidate);
			}
		}
		return primes;
	}

	public static class PrimeNumberChecker {
		public static Boolean validate(Integer primeNumber) {
			for (int i = 2; i <= (primeNumber / 2); i++) {
				if (primeNumber % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
