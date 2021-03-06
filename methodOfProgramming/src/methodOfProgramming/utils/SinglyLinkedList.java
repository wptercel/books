package methodOfProgramming.utils;

public class SinglyLinkedList<T> {
	private Node headPointer;
	
	public SinglyLinkedList() {
		this.headPointer = new Node(null, null);
	}

	public Node getHead() {
		return headPointer.getNext();
	}
	
	public void addBeforeHead(T newValue) {
		Node newNode = new Node(newValue, this.headPointer.getNext());
		this.headPointer.setNext(newNode);
	}

	public class Node {
		private T value;
		private Node next;

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}

	}
}
