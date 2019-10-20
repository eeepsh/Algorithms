package dataStructure.searchSortLinkedListlab82;



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

	}

	public void build(String[] arr) {
		if (arr == null || arr.length == 0)
			return;
		for (int i = 0; i < arr.length; i++) {
			add(arr[i]);
			//System.out.println("array "+arr[i]);
		}
		
	}

	public String insert(String data, int pos) {
		if (data == null || pos < 0)
			return null;
		Node previousNode = header.next;
		int count = 0;
		if (pos == 0) {
			add(data);
		} else {
			while (previousNode != null) {
				if (pos == count + 1) {
					Node nodeToBeInserted = new Node(previousNode.next, previousNode, data);
					if (previousNode != null) {
						previousNode.next.previous = nodeToBeInserted;
					}
					previousNode.next = nodeToBeInserted;
					size++;
					return previousNode.value;
				}
				previousNode = previousNode.next;
				count++;

			}
		}
		return previousNode.value;

	}

	private int size() {
		return size;
	}

	public boolean remove(String data) {
		Node nodeToBeRemoved = findNode(data);
		if (nodeToBeRemoved != null) {
			Node perviousNode = nodeToBeRemoved.previous;
			Node nextNode = nodeToBeRemoved.next;
			perviousNode.next = nextNode;
			if (nextNode != null) {
				nextNode.previous = perviousNode;
			}
			if (data == null)
				return false;
			Node temp = header.next; // yo block bhujechaina
			while (temp != null) {
				if (temp.value.equals(data)) {
					temp.previous.next = temp.next;
					temp.next.previous = temp.previous;
					size--;
				}
				temp = temp.next;
			}
		}

		return false;
	}

	private Node findNode(String data) {
		Node currentNode = header.next;
		while (currentNode != null) {
			currentNode = currentNode.next;
			if (currentNode.value.equals(data)) {

				return currentNode;
			}
			
		}
		// TODO Auto-generated method stub
		return currentNode;
	}

	// sorting
	public void sort() {
		if (header.next == null || size() <= 1)
			return;
		for (int i = 0; i < size(); i++) {
			Node n = findNode(arr[i]);
			Node min = minNode(n);
			swap(n, min);

		}

	}

	private void swap(Node n, Node min) {
		Node temp = new Node(null, null, null);
		temp.value = n.value;
		n.value = min.value;
		min.value = temp.value;
		// TODO Auto-generated method stub

	}

	private Node minNode(Node n) {
		if (n == null)
			return null;
		Node minimumNode = n;
		Node currentNode = n.next;
		while (currentNode != null) {
			if (currentNode.value.compareTo(minimumNode.value) < 0) {
				minimumNode = currentNode;
			}
			currentNode = currentNode.next;

		}
		// TODO Auto-generated method stub
		return minimumNode;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		String result = sb.toString();
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;

	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
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
		list.insert("Deepa", 1);
		System.out.println("\nThe list asfter inserting:");
		System.out.println(list);


		list.sort();
		System.out.println("\nThe list asfter sorting:");
		System.out.println(list);

	}
}
