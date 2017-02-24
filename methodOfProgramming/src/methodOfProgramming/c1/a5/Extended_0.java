package methodOfProgramming.c1.a5;

import methodOfProgramming.utils.SinglyLinkedList;

/*
 * Singly linked list palindrome
 */
public class Extended_0 {

	public Extended_0() {
		
	}
	
	public static void main(String args[]) {
		SinglyLinkedList<Character> slList = new SinglyLinkedList<>();
		slList.addBeforeHead('A');
		slList.addBeforeHead('B');
		slList.addBeforeHead('C');
		slList.addBeforeHead('D');
		slList.addBeforeHead('E');
		slList.addBeforeHead('F');
		SinglyLinkedList<Character>.Node cur = slList.getHead();
		while(cur != null) {
			System.out.print(cur.getValue() + " ");
			cur = cur.getNext();
		}
		System.out.println();
		cur = reverseSinglyLinkedList(slList.getHead());
		
		while(cur != null) {
			System.out.print(cur.getValue() + " ");
			cur = cur.getNext();
		}
		System.out.println();
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
