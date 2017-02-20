package methodOfProgramming.c1.a2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import methodOfProgramming.utils.MyStrings;

public class SolutionTest {
	private List<ASolution> solutions;
	private String inputShortString;
	private String inputLongString;
	
	@Before
	public void setup(){
		inputLongString = MyStrings.createRandomString(100, true, false);
		inputShortString = MyStrings.createRandomString(10, true, false);
		
		System.out.println("Long String:  " + inputLongString);
		System.out.println("Short String: " + inputShortString);
		
		solutions = new ArrayList<ASolution>();
		solutions.add(new Solution_0(inputLongString, inputShortString));
		solutions.add(new Solution_1(inputLongString, inputShortString));
//		solutions.add(new Solution_2(inputLongString, inputShortString));
		solutions.add(new Solution_3(inputLongString, inputShortString));
	}
	
	@Test
	public void test() {
		Boolean sameResult = null;
		for(ASolution s : solutions){
			boolean currentReult = s.resolve();
			
			System.out.println(s.getClass().getSimpleName() + " = " + currentReult);
			Assert.assertEquals(sameResult == null ? currentReult : sameResult.booleanValue(), currentReult);
			sameResult = new Boolean(currentReult);
		}
	}

}
