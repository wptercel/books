package methodOfProgramming.c1.a5;

import methodOfProgramming.utils.SinglyLinkedList;

public class Extended_2 {

	public static boolean isPalindrome(SinglyLinkedList<Character>.Node head) {
		SinglyLinkedList<Character>.Node slow = head;
		SinglyLinkedList<Character>.Node fast = head;

		while (fast != null) {
			slow = slow.getNext();
			fast = fast.getNext();
			if (fast != null) {
				fast = fast.getNext();
			}
		}

		SinglyLinkedList<Character> stack = new SinglyLinkedList<>();
		while (slow != null) {
			stack.addBeforeHead(slow.getValue());
			slow = slow.getNext();
		}
		
		// compare, stack.lenght <= len/2
		SinglyLinkedList<Character>.Node leftIndex = head;
		SinglyLinkedList<Character>.Node rightIndex = stack.getHead();
		while(rightIndex != null){
			if(!leftIndex.getValue().equals(rightIndex.getValue())){
				return false;
			}
			leftIndex = leftIndex.getNext();
			rightIndex = rightIndex.getNext();
		}
		
		return true;
	}
}
