package methodOfProgramming.utils.sorts;

import methodOfProgramming.utils.MyArrays;

public class QuickSort0 {

	public static void sort(int[] input) {
		sort(input, Order.ASC);
	}

	public static void sort(int[] input, Order order) {
		sortPartition(input, 0, input.length);
	}
	
	// Too many edge cases to consider, could be simpler
	private static void sortPartition(int[] input, int start, int end){
		int len = end - start;
		
		if(len <= 1){
			return;
		}
		
		int pivotIndex = end - 1;
		int leftIndex = start;
		int rightIndex = end - 2;
		while(leftIndex <= rightIndex){ // if <, {4,2,1,3} will cause error, because after swapping 4 - 1, 2 won't be treated
			if(input[leftIndex] > input[pivotIndex] && input[rightIndex] <= input[pivotIndex]){
				MyArrays.swap(input, leftIndex++, rightIndex--);
			}
			else if(input[leftIndex] <= input[pivotIndex]){
				leftIndex++;
			}
			else if(input[rightIndex] > input[pivotIndex]){
				rightIndex--;
			}
		}
		
		// move pivot to it's right location
		int newPivotLocation = pivotIndex;
		if(input[leftIndex] > input[pivotIndex]){
			MyArrays.swap(input, leftIndex, pivotIndex);
			newPivotLocation = leftIndex;
		}
		else if(input[rightIndex] > input[pivotIndex]){ // Only swapping with bigger one can keep the recursion be true in every loop
			MyArrays.swap(input, rightIndex, pivotIndex);
			newPivotLocation = rightIndex;
		}
		
		// recursively sort left partition and right partition
		sortPartition(input, start, newPivotLocation);
		sortPartition(input, newPivotLocation + 1, end);
	}
}
