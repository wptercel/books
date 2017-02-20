package methodOfProgramming.utils.sorts;

import methodOfProgramming.utils.MyArrays;

public class InsertionSort {
	public static void sort(int[] input) {
		int len = input.length;
		if (len <= 1) {
		}

		for (int i = 0; i < len; i++) {
			int currentMinIndex = i;
			for (int j = i + 1; j < len; j++) {
				currentMinIndex = input[currentMinIndex] <= input[j] ? currentMinIndex : j;
			}
			MyArrays.swap(input, i, currentMinIndex);
		}
	}
}
