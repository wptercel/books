package methodOfProgramming.c2.a1;

import java.util.Arrays;

import methodOfProgramming.utils.MyArrays;

public class Solution_1 extends ASolution {

	public Solution_1(int[] input) {
		super(input);
	}

	@Override
	public int resolve(int k) {
		int inputLen = input.length;

		int[] partiallySorted = new int[k];
		for (int i = 0; i < k; i++) {
			partiallySorted[i] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < inputLen; i++) {
			if (input[i] >= partiallySorted[k - 1]) {
				break;
			}
			fixedLengthInsertionSort(partiallySorted, input[i]);
		}
		System.out.println(Arrays.toString(partiallySorted));
		return partiallySorted[k - 1];
	}

	private static void fixedLengthInsertionSort(int[] sortedArray, int toBeInserted) {
		int len = sortedArray.length;
		if (len == 0) {
			return;
		}
		sortedArray[sortedArray.length - 1] = toBeInserted;

		if (len == 1) {
			return;
		}
		for (int i = sortedArray.length - 1; i > 0; i--) {
			if (sortedArray[i - 1] > sortedArray[i]) {
				MyArrays.swap(sortedArray, i - 1, i);
			}
			else{
				break;
			}
		}
	}

}
