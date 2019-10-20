package dataStructure.treeOperations.employeeBST;

import javax.swing.text.AbstractDocument.LeafElement;

public class EmployeeBST {

	private Node root;
	NameComparator nBST = new NameComparator();

	public EmployeeBST(Node root) {

		this.root = root;
	}

	public EmployeeBST(NameComparator nBST) {

		this.nBST = nBST;
	}

	public void printTree() { // tree print garna tree ko root khali cha ki nai
								// check gara khali nabhaye root value pass
								// garera arko print tree a pathau
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	private void printTree(Node root) { // if root element cha bhane jaslai aile
										// t bhaneako cha
		// TODO Auto-generated method stub

		if (root != null) { // feri root null nahuda
			printTree(root.left); // recursion lagako, root ko left lai pass
									// garera
			System.out.println(root.emp); // ani value aucha left jun root
											// huncha so tesko element named as
											// emp is printed
			printTree(root.right); // left nabhaye right value rakhera feri
									// traverse garaune

		}

	}
	// tree traversing is on the basis of elements

	private boolean find(Employee elm) {
		if (elm == null) { // elm mean element null bhaye tyo tree ko node
							// khojnai parena so return false
			return false;
		}
		return find(elm, root);// elem ma kunai values bhaye tyo rakhera find
								// method call garne ra arko find method with
								// arguments banau

	}

	private boolean find(Employee elm, Node root2) {// find method with value
													// and node root
		// TODO Auto-generated method stub

		if (root2 == null) { // if root nai null bhaye false
			return false;
		}
		if (root2 != null && root2.emp.equals(elm)) {// root null nabhaye ani
														// root ko element
														// equals khojnu parne
														// element elm bhaye
														// return true
			return true;

		}
		return (nBST.compare(elm, root2.emp) == 0);// return using compare
													// method with elm and
													// emp==0
		// return false;
	}

	// tree ma insert garna
	public void insert(Employee newElement) {
		if (root == null) {// root node nai null bhaye root node mai insert
							// garne naya node
			root = new Node(null, null, null);
		} else { // nabhaye root ko left tira jane ani left node nai root
					// baanaune
			Node leafNode = root;
			boolean inserted = false;//  inserted bhanne boolean check garna banaune
			while (!inserted) {// yedi inserted bhayo bhane mean true bhayo bhane break garne while loop 
				if (nBST.compare(newElement, leafNode.emp) < 0) {
					//compare methd le namecomparator call garera  tree ma rakhna lako new element sanga 
					//compare garne ani if less the 0 mean welement sano bhaye left tira jane tholo bhaye right tira
					if (leafNode.left == null) {
						leafNode.left = new Node(null, null, newElement);
						inserted = true;
					} else {
						leafNode = leafNode.left;
					}

				} else if (nBST.compare(newElement, leafNode.emp) > 0) {
					if (leafNode.right == null) {
						leafNode.right = new Node(null, null, newElement);
						inserted = true;
					} else {
						leafNode = leafNode.right;
					}
				}
			}

		}

	}

	private class Node {
		private Node left;
		private Node right;
		private Employee emp;

		Node(Node left, Node right, Employee emp) {
			this.left = left;
			this.right = right;
			this.emp = emp;

		}

	}

}
