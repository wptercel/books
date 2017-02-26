package methodOfProgramming.c1.a6;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SolutionTests {

	@Test
	public void test() {
		List<ASolution> solutions = new ArrayList<ASolution>();
		solutions.add(new Solution_0(""));
		solutions.add(new Solution_0("a"));
		solutions.add(new Solution_0("aaa"));
		solutions.add(new Solution_0("adabcba"));
		solutions.add(new Solution_0("abcddcba"));
		solutions.add(new Solution_0("abcdedcba"));
		solutions.add(new Solution_0("aabcdedcba"));
		
		for(ASolution s : solutions){
			System.out.println(s.resolve());
		}
	}

}
