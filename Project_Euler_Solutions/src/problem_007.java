/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class problem_007 {

	public static final int primeToGet = 10001;
	
	public static void main(String[] args){
		int primeAt = 1; //number of primes we've found
		int prime = 2;   //number we are testing if prime
		
		while(primeAt < primeToGet){
			prime++;
			
			if(isPrime(prime)){
				primeAt++;
			}
		}
		
		System.out.println(prime);
	}
	
	
	/**
	 * determine if 'n' is a prime number
	 */
	public static boolean isPrime(int n){
		boolean ret = true;
		
		for(int i = 2; i * i <= n; i++){
			if(n % i == 0){ //n is evenly divisible by i, so it's not prime
				ret = false;
				break;
			}
		}
		
		return ret;
	}
	
	
}
