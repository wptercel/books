package methodOfProgramming.c2.a1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import methodOfProgramming.utils.MyArrays;

public class SolutionTests {

	@Test
	public void test() {
		int[] input = MyArrays.CreateRandomIntArray(100);
		List<ASolution> solutions = new ArrayList<ASolution>();
		solutions.add(new Solution_0(input));
		solutions.add(new Solution_1(input));
		for(ASolution solution : solutions){
			System.out.println(solution.resolve(99));
		}
	}

}
