package methodOfProgramming.c1.a3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		String candidates = "ABC";
		List<ASolution> solutions = new ArrayList<ASolution>();
		solutions.add(new Solution_0(candidates));
		
		for(ASolution s : solutions){
			List<String> result = s.resolve();
			System.out.println(result);
		}
	}

}
