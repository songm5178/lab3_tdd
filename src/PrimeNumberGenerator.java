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
		if(i>1){
			primes.add(2);
		}else if(i>2){
			primes.add(3);
		}
		return primes;
	}
}
