package questao6;

import java.util.LinkedList;

public class Tree {

	public Node root;

	public Tree(){
		Node node1 = new Node(2);
		Node node2 = new Node(0);
		Node node3 = new Node(1);
		Node node4 = new Node(9);
		Node node5 = new Node(0);
		Node node6 = new Node(0);
		Node node7 = new Node(4);
		Node node8 = new Node(0);
		Node node9 = new Node(9);
		Node node10 = new Node(9);
		Node node11 = new Node(9);
			
		root = node6;
			
		node6.setChilds(node4, node10);
		node4.setChilds(node2, node5);
		node10.setChilds(node8, node11);
		node2.setChilds(node1, node3);
		node8.setChilds(node7, node9);
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node root) {
		if (root != null) {
			System.out.print(root);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root);
			inOrder(root.right);
		}
	}

	public void posOrder() {
		posOrder(root);
	}

	private void posOrder(Node root) {
		if (root != null) {
			posOrder(root.left);
			posOrder(root.right);
			System.out.print(root);
		}
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		while (!queue.isEmpty()) {
			Node current = queue.removeFirst();
			if (current != null) {
				System.out.println(root);
				queue.addLast(current.left);
				queue.addLast(current.right);
			}
		}
	}
}