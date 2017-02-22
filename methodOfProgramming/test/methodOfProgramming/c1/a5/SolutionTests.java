package methodOfProgramming.c1.a5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class SolutionTests {

	private class Pair {
		private String leftVal;
		private Boolean rightVal;

		private Pair(String lv, Boolean rv) {
			this.leftVal = lv;
			this.rightVal = rv;
		}

		private String getLeft() {
			return leftVal;
		}

		private boolean getRight() {
			return rightVal.booleanValue();
		}
	}

	@Test
	public void test() {
		List<Pair> inputs = new ArrayList<Pair>();
		inputs.add(new Pair("abcdcba", true));
		inputs.add(new Pair("abccba", true));
		inputs.add(new Pair("", true));
		inputs.add(new Pair("a", true));
		inputs.add(new Pair("aa", true));
		inputs.add(new Pair("aaa", true));
		inputs.add(new Pair("abcd", false));

		for (Pair p : inputs) {
			Assert.assertEquals(p.getRight(), new Solution_0(p.getLeft()).resolve());
			Assert.assertEquals(p.getRight(), new Solution_1(p.getLeft()).resolve());
		}
	}

}
