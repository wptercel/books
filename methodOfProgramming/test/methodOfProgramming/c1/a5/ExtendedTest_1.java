package methodOfProgramming.c1.a5;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

import methodOfProgramming.utils.SinglyLinkedList;

public class ExtendedTest_1 {

	@Test
	public void test() {
		List<Pair> inputs = new ArrayList<>();
		inputs.add(new Pair(createSinglyLinkedList(""), true));
		inputs.add(new Pair(createSinglyLinkedList("a"), true));
		inputs.add(new Pair(createSinglyLinkedList("abcba"), true));
		inputs.add(new Pair(createSinglyLinkedList("abccba"), true));
		inputs.add(new Pair(createSinglyLinkedList("abcde"), false));
		
		for(Pair p : inputs){
			Assert.assertEquals(p.getRight(), Extended_1.isPalindrome(p.getLeft()));
		}
	}

	private SinglyLinkedList<Character>.Node createSinglyLinkedList(String str) {
		int len = str.length();
		if (len == 0) {
			return null;
		}
		SinglyLinkedList<Character> singlyLinkedList = new SinglyLinkedList<Character>();
		for (int i = len - 1; i >= 0; i--) {
			singlyLinkedList.addBeforeHead(str.charAt(i));
		}
		return singlyLinkedList.getHead();
	}
	
	private class Pair{
		private SinglyLinkedList<Character>.Node left;
		private boolean right;
		
		public Pair(SinglyLinkedList<Character>.Node left, boolean right){
			this.left = left;
			this.right = right;
		}
		
		public SinglyLinkedList<Character>.Node getLeft(){
			return this.left;
		}
		
		public boolean getRight(){
			return this.right;
		}
	}
}
