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

    public void inOrder(Node node){
        if(node != null){

            // traverse left subtree
            inOrder(node.left);
            System.out.print(node.data + " ");

            // traverse right subtree
            inOrder(node.right);
            // System.out.println("InOrder Right: " + node.data);
        }
    }

    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();

        // create root
        tree.root = new Node(1);
        // create left subtree
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        // create left subtree of left child
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of binary tree is:");
        tree.inOrder(tree.root);

    }
}
