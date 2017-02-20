package methodOfProgramming.utils.sorts;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import methodOfProgramming.utils.MyArrays;

public class QuickSortTest {

	@Test
	public void test() {
		int testLen = 100;
		int[] input = MyArrays.CreateRandomIntArray(testLen);
		System.out.println(Arrays.toString(input));
		QuickSort1.sort(input);
		System.out.println(Arrays.toString(input));
		for(int i = 1; i <= testLen; i++){
			Assert.assertEquals(i, input[i - 1]);
		}
	}

}
