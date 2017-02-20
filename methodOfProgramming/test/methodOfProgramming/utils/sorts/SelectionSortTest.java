package methodOfProgramming.utils.sorts;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import methodOfProgramming.utils.MyArrays;

public class SelectionSortTest {
	@Test
	public void test() {
		int len = 100;
		int[] input = MyArrays.CreateRandomIntArray(len);
		System.out.println(Arrays.toString(input));
		SelectionSort.sort(input);
		System.out.println(Arrays.toString(input));
		for (int i = 1; i <= len; i++) {
			Assert.assertEquals(i, input[i - 1]);
		}
	}
}
