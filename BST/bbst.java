package BST;

import java.util.ArrayList;

public class bbst {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
   
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node createbst(ArrayList<Integer> inorder, int start, int end){
        if(start> end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createbst(inorder, start, mid-1);
        root.right = createbst(inorder, mid+1, end);
        return root;
    }
    public static Node balancebst(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);
        root = createbst(inorder, 0, inorder.size()-1);
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left= new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        // int arr[] = {3, 5, 6, 8, 10, 11, 12};
        // Node root = createbst(arr, 0, arr.length-1);
        root = balancebst(root);
        preorder(root);
    }
    
}
