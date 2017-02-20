package methodOfProgramming.utils.sorts;

import methodOfProgramming.utils.MyArrays;

public class SelectionSort {
	public static void sort(int[] input){
		int len = input.length;
		if(len <= 1){
			return;
		}
		
		for(int i = 0; i < len; i++){			
			int currentMinIndex = i;
			for(int j = i+ 1; j < len; j++){
				currentMinIndex = input[currentMinIndex] <= input[j] ? currentMinIndex : j;
			}
			
			MyArrays.swap(input, currentMinIndex, i);
		}
	}
}
