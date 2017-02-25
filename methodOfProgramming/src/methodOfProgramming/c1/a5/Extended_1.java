package methodOfProgramming.c1.a5;

import java.util.Stack;

import methodOfProgramming.utils.SinglyLinkedList;

public class Extended_1 {

	public static boolean isPalindrome(SinglyLinkedList<Character>.Node head){
		Stack<Character> stack = new Stack<>();
		SinglyLinkedList<Character>.Node index = head;
		while(index != null){
			stack.push(index.getValue());
			index = index.getNext();
		}
		
		index = head;
		while(!stack.isEmpty()){
			if(!stack.pop().equals(index.getValue())){
				return false;
			}
			index = index.getNext();
		}
		return true;
	}
}
