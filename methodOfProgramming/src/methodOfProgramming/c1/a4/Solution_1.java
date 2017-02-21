package methodOfProgramming.c1.a4;

public class Solution_1 extends ASolution {

	public Solution_1(String input) {
		super(input);
	}

	@Override
	int resolve() throws IllegalArgumentException{
		int result = 0;
		int startIndex = 0;
		boolean isNegative = input[0] == '-';
		if(input[0] == '-' || input[0] == '+'){
			startIndex++;
		}
		for(int i = startIndex; i < input.length; i++){
			int currentDigit = input[i] - '0';
			if(currentDigit > 9 || currentDigit < 0){
				throw new IllegalArgumentException();
			}
			
			if(!isNegative && (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && currentDigit > Integer.MAX_VALUE % 10))){
				result = Integer.MAX_VALUE;
				break;
			}
			if(isNegative && (result > (Integer.MAX_VALUE - 1)/10 || (result == (Integer.MAX_VALUE - 1)/10 && currentDigit > (Integer.MAX_VALUE - 1) % 10))){
				result = Integer.MIN_VALUE;
				break;
			}
			result = isNegative ? 0 - (result * 10 + currentDigit) : result * 10 + currentDigit;
		}
		return result;
	}

}
