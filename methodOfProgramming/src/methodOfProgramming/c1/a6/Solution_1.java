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
		lengths[0] = 1;

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
		transformedString[transformedStrLen - 1] = '@';
		System.out.println(Arrays.toString(transformedString));
	}

	@Override
	public String resolve() {
		int coverageEnd = 0;
		int coverageCenter = 0;
		for (int i = 1; i < transformedStrLen; i++) {
			int mirrorCenter = Math.max(2 * coverageCenter - i, 0); // coverageCenter - ( i - coverageCenter)
			int mirrorLeftEnd = 2 * coverageCenter - i - (lengths[mirrorCenter] - 1);
			int coverageLeftEnd = 2 * coverageCenter - coverageEnd;
			if (coverageLeftEnd < mirrorLeftEnd) {
				lengths[i] = lengths[mirrorCenter];

			} else {
				int armLength = coverageLeftEnd - mirrorLeftEnd;
				while (isSymmetrical(i, armLength)) {
					armLength++;
				}
				lengths[i] = armLength;
			}

			if (coverageCenter + lengths[coverageCenter] - 1 < i + lengths[i] - 1) {
				coverageCenter = i;
				coverageEnd = coverageCenter + lengths[coverageCenter] - 1;
			}
			if (coverageCenter + lengths[coverageCenter] - 1 == i + lengths[i] - 1) {
				coverageCenter = lengths[coverageCenter] > lengths[i] ? coverageCenter : i;
				coverageEnd = coverageCenter + lengths[coverageCenter] - 1;
			}
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
