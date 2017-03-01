package methodOfProgramming.c1.a6;

import java.util.Arrays;

public class Solution_1 extends ASolution {
	private final char DELIMITER = '#';
	private char[] transformedString;
	private int[] lengths;

	private int transformedStrLen;

	public Solution_1(String input) {
		super(input);
		int inputLength = input.length();
		transformedStrLen = 2 * inputLength + 3;

		// pre-process
		lengths = new int[transformedStrLen];

		transformedString = new char[transformedStrLen];
		transformedString[0] = '$';
		for (int i = 1; i < transformedStrLen - 2; i++) {
			if (i % 2 != 0) {
				transformedString[i] = DELIMITER;
			} else {
				transformedString[i] = input.charAt(i / 2 - 1);
			}
		}
		transformedString[transformedStrLen - 2] = DELIMITER; // to handle empty input
		transformedString[transformedStrLen - 1] = '\0';
		System.out.println(Arrays.toString(transformedString));
	}

	@Override
	public String resolve() {
		// initiate lengths[]
		for(int i = 0; i < transformedStrLen; i++){
			int armLength = 1;
			while(isSymmetrical(i, armLength)){
				armLength++;
			}
			lengths[i] = armLength;
		}
		
		System.out.println(Arrays.toString(lengths));
		return null;
	}

	private boolean isSymmetrical(int center, int armLength) {
		if (center - armLength < 0 || center + armLength >= transformedStrLen) {
			return false;
		}
		return transformedString[center - armLength] == transformedString[center + armLength];
	}

	public static void main(String args[]) {
		new Solution_1("abcbddbc").resolve();
	}
}
