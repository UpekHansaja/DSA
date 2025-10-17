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
                    current.left = new Node(values[i++]);
                    queue.add(current.left);
                }

                // right
                if (i < values.length) {
                    current.right = new Node(values[i++]);
                    queue.add(current.right);
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

        int[] values = {10, 5, 15, 3, 7, 12, 17, 1, 4, 6, 8};
        tree.root = tree.buildTree(values);

        System.out.println("Inorder traversal of the constructed tree is:");
        tree.inOrder(tree.root);

    }

}