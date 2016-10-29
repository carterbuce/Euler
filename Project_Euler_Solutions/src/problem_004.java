

/**
 * A palindromic number reads the same both ways. The largest palindrome 
 * made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class problem_004 {
	
	/*
	 * the highest possible product of two 3-digit numbers is 998001
	 * so this will fit into an int.
	 */
	public static void main(String[] args){

		System.out.println("Max is " + getLargestPalindrome(100, 999));
		
	} 
	
	
	/*
	 * Step through every possible combination, checking if it's a palindrome
	 * If it is a palindrome, check it with the max to see if it's larger
	 */
	public static int getLargestPalindrome(int min, int max){
		int maxPal = -1;
		
		for(int one = min; one <= max; one++){
			for(int two = one + 1; two <= max; two++){ //one + 1 to avoid duplicate calculations 
				int product = one * two;
				if(isPalindrome(product)){
					maxPal = product > maxPal ? product : maxPal;
				}
			}
		}
		
		return maxPal;
	}
	
	
	/*
	 * convert int to string and compare with reverse to see if it's a palindrome
	 */
	public static boolean isPalindrome(int i){
		String s = Integer.toString(i);
		
		return s.equals(new StringBuilder(s).reverse().toString());
		
	}
	
}
