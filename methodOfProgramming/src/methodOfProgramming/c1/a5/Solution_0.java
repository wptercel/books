package methodOfProgramming.c1.a5;

public class Solution_0 extends ASolution {

	public Solution_0(String input) {
		super(input);
	}

	@Override
	public boolean resolve() {
		int len = input.length();
		if(len <= 1){
			return true;
		}
		
		for(int i = 0; i < len / 2; i++){
			if(input.charAt(i) != input.charAt(len - i - 1)){
				return false;
			}
		}
		return true;
	}

}
