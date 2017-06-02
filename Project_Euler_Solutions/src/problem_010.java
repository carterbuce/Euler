/** The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *  Find the sum of all the primes below two million.
 */
public class problem_010 {

	
	public static void main(String[] args) {
		long sum = 0;
		
		for(int i = 0; i <= 2000000; i++){
			if(isPrime(i)) sum += i;
		}
		
		System.out.println(sum);
	}
	
	
	/**
	 * determine if 'n' is a prime number
	 */
	public static boolean isPrime(int n){
		boolean nIsPrime = true;
		
		if(n < 2){
			return false;
		}
		
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0){ //n is evenly divisible by i, so it's not prime
				nIsPrime = false;
				break;
			}
		}
		
		return nIsPrime;
	}
	
}
