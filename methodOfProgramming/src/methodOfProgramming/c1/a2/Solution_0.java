package methodOfProgramming.c1.a2;

public class Solution_0 extends ASolution{
	public Solution_0(String longString, String shortString){
		super(longString, shortString);
	}

	@Override
	public boolean resolve(){ // Brutal force
		long startTime = System.currentTimeMillis();
		int longLen = longString.length();
		int shortLen = shortString.length();
				
		for(int i = 0; i < shortLen; i++){
			for(int j = 0; j < longLen; j++){
				if(shortString.charAt(i) != longString.charAt(j)){
					if(j == longLen - 1){
						return false;
					}
					continue;
				}
				break;
			}
		}
		System.out.println(System.currentTimeMillis() - startTime);
		return true;
	}
}