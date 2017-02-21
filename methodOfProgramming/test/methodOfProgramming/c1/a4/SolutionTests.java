package methodOfProgramming.c1.a4;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SolutionTests {

	@Test
	public void test() {
		String input = "-123123123124124123";
		List<ASolution> solutions = new ArrayList<ASolution>();
		solutions.add(new Solution_0(input));
		solutions.add(new Solution_1(input));
		
		for(ASolution s : solutions){
			System.out.println(s.resolve());
		}
	}

}
