package methodOfProgramming.c1.a2;

public class Solution_2 extends ASolution{
	private int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
	
	public Solution_2(String longString, String shortString){
		super(longString, shortString);
	}
	
	@Override
	public boolean resolve(){
		long startTime = System.currentTimeMillis();
		
		long signature = 1;
		char[] longStringChars = longString.toCharArray();
		for(char lc : longStringChars){
			int primeRef = primes[lc - 'A'];
			if(signature % primeRef != 0){
				signature *= primeRef;
			}
		}
		
		char[] shortStringChars = shortString.toCharArray();
		for(char sc : shortStringChars){
			if(signature % primes[sc - 'A'] != 0){
				System.out.println(System.currentTimeMillis() - startTime);
				return false;
			}
		}
		
		System.out.println(System.currentTimeMillis() - startTime);
		return true;
	}
}
