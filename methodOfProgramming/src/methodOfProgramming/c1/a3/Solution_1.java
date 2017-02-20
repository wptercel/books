package methodOfProgramming.c1.a3;

import java.util.List;

import methodOfProgramming.utils.MyArrays;

public class Solution_1 extends ASolution {
	public Solution_1(String input) {
		super(input);
	}

	@Override
	public List<String> resolve() {
		// The input must be the smallest order.
		if (candidates.length == 0) {
			return resultHolder;
		}

		resultHolder.add(new String(candidates));

		while (nextPermutation() == true) {
		}
		return resultHolder;
	}

	private boolean nextPermutation() {
		int i = candidates.length - 2;
		for (; i >= 0 && candidates[i] >= candidates[i + 1]; i--) {
		}

		if (i < 0) {
			return false;
		}

		int j = candidates.length - 1;
		for (; j > i && candidates[i] >= candidates[j]; j--) {
		}

		MyArrays.swap(candidates, i, j);
		MyArrays.reverse(candidates, i + 1, candidates.length - 1);
		resultHolder.add(new String(candidates));
		return true;
	}
}
