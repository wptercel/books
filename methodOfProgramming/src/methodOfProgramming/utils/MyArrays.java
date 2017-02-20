package methodOfProgramming.utils;

import java.util.List;
import java.util.ArrayList;

public class MyArrays {
	public static int[] CreateRandomIntArray(int size) {
		int[] result = new int[size];
		List<Integer> remainingNumbers = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			remainingNumbers.add(i + 1);
		}

		int initialIndex = 0;
		while (remainingNumbers.size() > 0) {
			int randomIndex = (int) (Math.random() * remainingNumbers.size());
			int randomNumber = remainingNumbers.get(randomIndex);
			result[initialIndex++] = randomNumber;
			remainingNumbers.remove(randomIndex);
		}

		return result;
	}

	public static void swap(int[] array, int pos1, int pos2) {
		int temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}

	public static void swap(char[] array, int pos1, int pos2) {
		char temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}

	public static void reverse(char[] array) {
		reverse(array, 0, array.length);
	}

	public static void reverse(char[] array, int from, int to) {
		int len = to - from + 1;
		if (len <= 1) {
			return;
		}
		for (int i = 0; i < len / 2; i++) {
			swap(array, from + i, to - i);
		}
	}
}