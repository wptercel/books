package methodOfProgramming.utils;

public class SinglyLinkedList<T> {
	private Node<T> head;

	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public class Node<NT> {
		private NT value;
		private Node<NT> next;

		public NT getValue() {
			return value;
		}

		public void setValue(NT value) {
			this.value = value;
		}

		public Node<NT> getNext() {
			return next;
		}

		public void setNext(Node<NT> next) {
			this.next = next;
		}

		public Node(NT value, Node<NT> next) {
			this.value = value;
			this.next = next;
		}

	}
}
