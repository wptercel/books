package methodOfProgramming.c1.a5;

import methodOfProgramming.utils.SinglyLinkedList;

/*
 * Singly linked list palindrome
 */
public class Extended_0 {

	public static boolean isPalindrome(SinglyLinkedList<Character>.Node head){
		SinglyLinkedList<Character>.Node slow = head;
		SinglyLinkedList<Character>.Node fast = head;
		while(fast != null){
			slow = slow.getNext();
			
			fast = fast.getNext();
			if(fast != null){
				fast = fast.getNext();
			}
		}
		
		SinglyLinkedList<Character>.Node rightHead = reverseSinglyLinkedList(slow);
		while(rightHead != null){
			if(!head.getValue().equals(rightHead.getValue())){
				return false;
			}
			head = head.getNext();
			rightHead = rightHead.getNext();
		}
		return true;
	}
	
	private static SinglyLinkedList<Character>.Node reverseSinglyLinkedList(SinglyLinkedList<Character>.Node head) {
		if (head == null || head.getNext() == null) {
			return head;
		}

		SinglyLinkedList<Character>.Node prevNode = head;
		SinglyLinkedList<Character>.Node currentNode = head.getNext();
		SinglyLinkedList<Character>.Node nextNode = head.getNext().getNext();
		while (nextNode != null) {
			currentNode.setNext(prevNode);
			prevNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.getNext();
		}
		currentNode.setNext(prevNode);
		head.setNext(null);
		return currentNode;
	}

}
