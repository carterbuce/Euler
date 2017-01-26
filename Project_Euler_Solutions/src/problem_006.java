/**
 * 
 * Find the difference between the sum 
 * of the squares of the first one hundred natural
 *  numbers and the square of the sum.
 *
 */

public class problem_006 {
	
	public static void main(String[] args){
		System.out.println(sumOfSquares(100));
		System.out.println(squareOfSum(100));
		System.out.println(squareOfSum(100) - sumOfSquares(100));
		
		
	}
	
	//Take the sum of the squares of the first i numbers
	private static int sumOfSquares(int i){
		int sum = 0;
		
		for(int j = 0; j <= i; j++){
			sum += (j * j);
		}
			
		return sum;
	}
	
	//Take the square of the sums of the first i numbers
	private static int squareOfSum(int i){
		int sum = 0;
		
		for(int j = 0; j <= i; j++){
			sum += j;
		}
		
		return (sum*sum);
	}
	
	
}
