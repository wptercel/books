package methodOfProgramming.c2.a1;

import java.util.Arrays;

public class Solution_0 extends ASolution {
	public Solution_0(int[] input) {
		super(input);
	}

	@Override
	public int resolve(int k) {
		System.out.println(Arrays.toString(input));
		quickSort(0, input.length - 1);
		System.out.println(Arrays.toString(input));
		return input[k - 1];
	}

	private void quickSort(int start, int end) {
		int len = end - start + 1;
		if (len <= 1) {
			return;
		}

		int pivot = input[end];
		int leftIndex = start;
		int rightIndex = end;
		while (leftIndex < rightIndex) {
			while (leftIndex < rightIndex && input[leftIndex] <= pivot) {
				leftIndex++;
			}
			input[rightIndex--] = input[leftIndex];

			while (leftIndex < rightIndex && input[rightIndex] > pivot) {
				rightIndex--;
			}
			input[leftIndex] = input[rightIndex];
		}
		input[leftIndex] = pivot;
		quickSort(start, leftIndex - 1);
		quickSort(leftIndex + 1, end);
	}
}
