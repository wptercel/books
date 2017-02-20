package methodOfProgramming.c1.a3;

import java.util.List;

import methodOfProgramming.utils.MyArrays;

public class Solution_0 extends ASolution {

	public Solution_0(String input) {
		super(input);
	}

	@Override
	public List<String> resolve() {
		calcAllPermutations(0, candidates.length);
		return resultHolder;
	}

	private void calcAllPermutations(int from, int to) { // to = finalIndex + 1
		if (from == to) { // means the candidates' size is 0
			resultHolder.add(new String(candidates, 0, to));
		}
		for (int i = from; i < to; i++) {
			MyArrays.swap(candidates, from, i);
			calcAllPermutations(from + 1, to);
			MyArrays.swap(candidates, from, i);
		}
	}

}
