package methodOfProgramming.c1.a5;

public class Solution_1 extends ASolution {

	public Solution_1(String input) {
		super(input);
	}

	@Override
	public boolean resolve() {
		int len = input.length();
		if(len <= 1){
			return true;
		}
		
		int offset = len >> 1;
		int leftIndex = offset - 1;
		int rightIndex = len - offset;
		
		while(leftIndex >= 0){
			if(input.charAt(leftIndex--) != input.charAt(rightIndex++)){
				return false;
			}
		}
		return true;
	}
}
