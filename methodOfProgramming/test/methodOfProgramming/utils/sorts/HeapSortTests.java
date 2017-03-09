package methodOfProgramming.utils.sorts;

import java.util.Arrays;

import org.junit.Test;

import methodOfProgramming.utils.MyArrays;

public class HeapSortTests {

	@Test
	public void test() {
		int[] input = MyArrays.CreateRandomIntArray(10);
		HeapSort_0 heapSort = new HeapSort_0();
		System.out.println(Arrays.toString(heapSort.sort(input)));
	}

}
