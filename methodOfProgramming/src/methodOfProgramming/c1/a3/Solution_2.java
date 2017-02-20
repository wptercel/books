package methodOfProgramming.c1.a3;

import java.util.List;

import methodOfProgramming.utils.MyArrays;

public class Solution_2 extends ASolution {
	private char[] candidatesForPrev;
	private char[] candidatesForNext;
	
	public Solution_2(String input) {
		super(input);
		candidatesForPrev = input.toCharArray();
		candidatesForNext = input.toCharArray();
	}

	@Override
	public List<String> resolve() {
		if(candidates.length == 0){
			return resultHolder;
		}
		
		resultHolder.add(new String(candidates));
		while(prevPermutation() == true){}
		while(nextPermutation() == true){}
		
		return resultHolder;
	}
	
	private boolean prevPermutation(){ // Find first desc pair from right to left
		int i = candidatesForPrev.length - 2;
		for(; i >= 0 && candidatesForPrev[i] <= candidatesForPrev[i+1]; i--){}
		if(i == -1){
			return false;
		}
		int j = candidatesForPrev.length - 1;
		for(; j > i && candidatesForPrev[i] <= candidatesForPrev[j]; j--){}
		MyArrays.swap(candidatesForPrev, i, j);
		MyArrays.reverse(candidatesForPrev, i + 1, candidatesForPrev.length - 1);
		resultHolder.add(new String(candidatesForPrev));
		return true;
	}
	
	private boolean nextPermutation(){ // Find first asc pair from right to left
		int i = candidatesForNext.length - 2;
		for(; i >= 0 && candidatesForNext[i] >= candidatesForNext[i+1]; i--){}
		if(i == -1){
			return false;
		}
		int j = candidatesForNext.length - 1;
		for(; j > i && candidatesForNext[i] >= candidatesForNext[j]; j--){}
		MyArrays.swap(candidatesForNext, i, j);
		MyArrays.reverse(candidatesForNext, i + 1, candidatesForNext.length - 1);
		resultHolder.add(new String(candidatesForNext));
		return true;
	}
}
