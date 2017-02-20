package methodOfProgramming.c1.a3;

import java.util.ArrayList;
import java.util.List;

/*
 * Print combinations of a set of chars
 * input: abc
 * output: a, b, c, ab, ac, bc, abc
 */
public class Extended {
	public static void main(String args[]) throws Exception{
		String input = "abcdefg";
		resolve(input);
	}
	
	// use binary number to represent if the chars exists or not
	// con: has limitation - the length of number - int = 64 chars
	public static void resolve(String input) throws IllegalArgumentException {
		if (input.length() > 31) {
			throw new IllegalArgumentException();
		}
		char[] candidates = input.toCharArray();
		int[] masks = new int[candidates.length];
		List<String> resultHolder = new ArrayList<String>();

		for (int i = 0; i < candidates.length; i++) {
			masks[i] = 1 << i;
		}

		int max = 1 << (input.length() + 1) - 1;
		for (int i = 1; i < max; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < masks.length; j++) {
				if ((i & masks[j]) != 0) {
					sb.append(candidates[j]);
				}
			}
			resultHolder.add(sb.toString());
		}
		System.out.println(resultHolder);
	}
}
