package methodOfProgramming.c1.a4;

public class Solution_0 extends ASolution {
	public Solution_0(String input) {
		super(input);
	}

	@Override
	public int resolve() {
		int result = 0;
		for (char c : input) {
			int currentDigit = c - '0';
			result = result * 10 + currentDigit;
		}
		return result;
	}
}
