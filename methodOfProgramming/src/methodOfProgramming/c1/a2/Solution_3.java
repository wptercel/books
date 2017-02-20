package methodOfProgramming.c1.a2;

public class Solution_3 extends ASolution{
	public Solution_3(String longString, String shortString){
		super(longString, shortString);
	}
	
	@Override
	boolean resolve() {
		char[] longStringChars = longString.toCharArray();
		char[] shortStringChars = shortString.toCharArray();
		int signature = 0;
		for(char lc : longStringChars){
			signature |= 1 << lc - 'A';
		}
		for(char sc : shortStringChars){
			if((signature & (1 << sc - 'A')) == 0){
				return false;
			}
		}
		return true;
	}
	
}
