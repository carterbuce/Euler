import java.util.ArrayList;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class problem_003 {
	
	public static void main(String[] args){
		//Initialize the initial number, starting factors to divide by, and list of factors
		long num = 600851475143L;
		long factor = 2;
		ArrayList<Long> allFactors = new ArrayList<Long>();
		
		//Find all primes that divide `num`, starting with the smallest and having a max
		//of sqrt(num) for efficiency, as the biggest 2 prime factors possible are the sqrt * sqrt 
		while(factor <= Math.sqrt(num)){
			if(num % factor == 0){ //we've found a factor
				allFactors.add(factor);
				
				//Divide out the factor, reset the factor to 2
				num /= factor;
				factor = 2;
			}
			else{
				//increment the factor
				factor++;
			}	
		}
		allFactors.add(num); //add the final prime number
		
		
		//the last number will be the largest, as we've procedurally divided out the smallest factors
		System.out.println(allFactors);
		System.out.println("Largest Factor: " + num);
		
	}
	
}
