import java.util.LinkedList;
import java.util.Queue;

class Node {

    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }

}

public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    public Node buildTree(int[] values) {

        if (values.length != 0) {

            Node root = new Node(values[0]);

            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);

            int i = 1;
            while (i < values.length && !queue.isEmpty()) {

                Node current = queue.poll();

                // left
                if (i < values.length) {
                    current.left = new Node(values[i]);
                    queue.add(current.left);
                    i++;
                }

                // right
                if (i < values.length) {
                    current.right = new Node(values[i]);
                    queue.add(current.right);
                    i++;
                }

            }

            return root;

        } else {
            return null;
        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        int[] values = { 20, 10, 30, 5, 15, 0, 40, 2, 7, 12, 18, 50 };

        tree.root = tree.buildTree(values);
        System.out.println("In-order traversal:");
        tree.inOrder(tree.root);

    }

}
