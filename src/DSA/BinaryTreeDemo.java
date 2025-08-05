package DSA;
class Node {
    int data;
    Node left,right;

    public Node(int item){
        data=item;
        left=right=null;
    }
}

public class BinaryTreeDemo {
    Node root;


    BinaryTreeDemo(){
        root=null;
    }


    void inorder(Node node){
        if (node==null)return;

        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }


    void preorder(Node node){
        if (node==null) return;

        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node){
        if (node==null) return;;


        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }


    public static void main(String[] args){
        BinaryTreeDemo tree= new BinaryTreeDemo();


        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);


        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder: ");
        tree.postorder(tree.root);


        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6
    }
}
