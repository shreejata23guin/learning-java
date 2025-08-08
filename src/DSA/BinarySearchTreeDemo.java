package DSA;

// Node class for BST
class Node {
    public boolean data;
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// BST Class
public class BinarySearchTreeDemo {
    Node root;

    BinarySearchTreeDemo() {
        root = null;
    }

    // Insert a new key
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key)
            root.left = insert(root.left, key);
        else if (key > root.key)
            root.right = insert(root.right, key);

        return root;
    }

    // Inorder Traversal (gives sorted output)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // Search for a key
    boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (key == root.key)
            return true;
        else if (key < root.key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // Main Method
    public static void main(String[] args) {
        BinarySearchTreeDemo bst = new BinarySearchTreeDemo();

        int[] keys = {50, 30, 70, 20, 40, 60, 80};

        for (int key : keys) {
            bst.root = bst.insert(bst.root, key); // insert each key
        }

        System.out.print("Inorder Traversal: ");
        bst.inorder(bst.root);  // Output should be sorted

        int searchKey = 60;
        System.out.println("\n\nIs " + searchKey + " present? " + bst.search(bst.root, searchKey));
    }
}
