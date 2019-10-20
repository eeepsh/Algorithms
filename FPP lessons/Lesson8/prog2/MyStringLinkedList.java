package Lesson8.prog2;

import java.util.Arrays;

public class MyStringLinkedList {
	String[] arr;
	Node header;
	int size = 0;

	MyStringLinkedList() {
		header = new Node(null, null, null);

	}

	public void add(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
		size++;

	}

	public void build(String[] arr) {
		if (arr == null || arr.length == 0)
			return;
		for (int i = 0; i < arr.length; i++) {
			add(arr[i]);
		}
	}

	public void insert(String data, int pos) {
		if (data == null || pos < 0)
			return;
		Node temp = header.next;
		int count = 0;
		if (pos == 0) {
			add(data);
		} else {
			while (temp != null) {

				if (pos == count + 1) {
					Node n = new Node(temp.next, temp, data);
					if (temp.next != null) {
						temp.next.previous = n;
					}
					temp.next = n;
					size++;
					return;
				}
				temp = temp.next;
				count++;
			}
		}
	}

	public void sort() {
		if (header.next == null || size() <= 1)
			return;
		for (int i = 0; i < size; ++i) {
			Node n = findIth(arr[i]);
			Node min = minNode(n);
			swap(n, min);
		}
	}

	void swap(Node n1, Node n2) {
		Node temp = header;
		temp.data = n2.data;
		n2.data = n1.data;
		n1.data = temp.data;
	}

	private Node findIth(String data) {

		Node current = header.next;
		while (current != null) {
			if (current.data.equals(data)) {
				current = current.next;
				return current;
			}
		}
		return current;
	}

	Node minNode(Node n) {
		// null check for n
		if (n == null)
			return null;
		Node min = n;
		Node current = n.next;
		while (current != null) {
			if (current.data.compareTo(min.data) < 0)
				min = current;
			current = current.next;
		}
		return min;
	}

	private int size() {
		return size;
	}

	public void remove(String data) {
		Node nodeToBeRemooved = findIth(data);
		if (nodeToBeRemooved != null) {
			Node previous = nodeToBeRemooved.previous;
			Node next = nodeToBeRemooved.next;
			previous.next = next;
			if (next != null) {
				next.previous = previous;
			}

			if (data == null)
				return;
			Node temp = header.next;
			while (temp != null) {
				if (temp.data == data) {
					temp.previous.next = temp.next;
					temp.next.previous = temp.previous;
					size--;
				}
				temp = temp.next;
			}
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ",");
			next = next.next;
		}
		String result = sb.toString();
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	public boolean search(String data) {
		Node temp = header.next;
		if (data == null)
			return false;

		while (temp != null) {
			if (temp.data.equals(data))
				return true;
			temp = temp.next;
		}
		return false;
	}

	public class Node {
		String data;
		Node next;
		Node previous;

		Node(Node next, Node previous, String data) {
			this.data = data;
			this.next = next;
			this.previous = previous;
		}

		@Override
		public String toString() {
			return data == null ? "null" : data;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.arr = new String[] { "big", "small", "tall", "short", "round", "square", "enormous", "tiny", "gargantuan",
				"lilliputian", "numberless", "none", "vast", "miniscule" };
		list.build(list.arr);

		System.out.println("The given list:");
		System.out.println(list);

		list.remove("none");
		list.insert("behailu", 1);
		list.build(list.arr);
		System.out.println(list);

		list.sort();
		System.out.println("\nThe list asfter sorting:");
		System.out.println(list);

	}

}
