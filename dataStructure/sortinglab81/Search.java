package dataStructure.sortinglab81;

class Search {
	String[] aString;

	// anArray is a sorted array
	Search(String[] aString) {
		this.aString = aString;
	}

	// search a sorted array
	boolean search(String val) {
		boolean b = recurse(0, aString.length - 1, val);
		return b;
	}

	boolean recurse(int a, int b, String val) {
		int mid = (a + b) / 2;
		if (aString[mid].equals(val))
			return true;
		if (a > b)
			return false;
		if (aString[mid].compareTo(val) < 0)
			return recurse(mid + 1, b, val);
		return recurse(a, mid - 1, val);
	}
}
