
/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class problem_005 {

	
	public static void main(String[] args){
		int answer = 1; //the answer will get incremented until it's divisible by everything up to 'divisibleupto'
		int divisibleupto = 20; //the number to test answer with
		
		while(true){
			if(dividedby(divisibleupto, answer)){
				break;
			}
			
			answer += 2; //increment by two since dividing by even numbers will require the number to be even
		}
		
		System.out.println(answer);
	}
	
	
	/**
	 * Determine if a number is divisible by every number from 1 through 'upto'
	 * @param upto the last number to check divisibility
	 * @param num the number ot test divisibility for
	 * @return if 'num' is divisible by every number from 1 to 'upto'
	 */
	public static boolean dividedby(int upto, int num){
		for(int i = 1; i <= upto; i++){
			if(num % i != 0){
				return false;
			}
		}
		
		return true;
	}
	
}
