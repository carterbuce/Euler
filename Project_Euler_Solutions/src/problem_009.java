/** There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class problem_009 {

	//Processors are fast enough that this is easy enough to brute force, even in o(n^3) 
	public static void main(String[] args) {
		for(int c = 0; c <= 1000; c++){
			for(int b = 0; b < c; b++){
				for(int a = 0; a < b; a++){
					if(isTriplet(a, b, c) && (a + b + c == 1000)){
						System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
						System.out.println(a * b * c);
					}
				}
			}
		}

	}
	
	public static boolean isTriplet(int a, int b, int c){
		if (!(c > b && b > a)){
			return false;
		}
		
		if(a*a + b*b != c*c){
			return false;
		}
		
		return true;
		
	}

}
