package methodOfProgramming.utils.sorts;

import methodOfProgramming.utils.MyArrays;

public class HeapSort_0 {
	public int[] sort(int[] input) {
		int len = input.length;
		Heap heap = new Heap(len);
		for(int i = 0; i<len; i++){
			heap.add(input[i]);
		}
		
		int[] result = new int[len];
		for(int i = len - 1; i>=0; i--){
			result[i] = heap.popTop();
		}
		return result;
	}

	private class Heap {
		private int[] heap;

		public Heap(int size) {
			this.heap = new int[size];
			for (int i = 0; i < size; i++) {
				this.heap[i] = Integer.MIN_VALUE;
			}
		}

		public int add(int element) { // add new element and return old max element
			int oldMax = this.heap[0];
			this.heap[0] = element;
			maxheapify(0);
			return oldMax;
		}
		
		public int popTop(){
			int oldMax = this.heap[0];
			this.heap[0] = Integer.MIN_VALUE;
			maxheapify(0);
			return oldMax;
		}

		private void maxheapify(int topPos) { // topPos is 0-indexed
			if (topPos > this.heap.length / 2) {
				return;
			}
			if (this.heap[topPos] < this.heap[topPos * 2]) {
				MyArrays.swap(this.heap, topPos, topPos * 2);
				maxheapify(topPos * 2);
			} else if (this.heap[topPos] < this.heap[topPos * 2 + 1]) {
				MyArrays.swap(this.heap, topPos, topPos * 2 + 1);
				maxheapify(topPos * 2 + 1);
			}
		}
	}
}
