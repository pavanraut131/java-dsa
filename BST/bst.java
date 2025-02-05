package BST;

import java.util.ArrayList;

public class bst {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left = delete(root.left, val);
        } else if(root.data<val){
            root.right = delete(root.right, val);
        } else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.right== null){
                return root.left;
            } else if(root.left == null){
                return root.right;
            }
             
            Node Is = fininordersuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right,Is.data);
        }
        
        return root;
    }

    public static Node fininordersuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;    
    }

    public static void printinrange(Node root, int k1, int k2){
       if(root == null){
        return;
       }
        if(root.data >= k1 && root.data <= k2){
            printinrange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printinrange(root.right, k1, k2);
        } else if(root.data < k1){
            printinrange(root.left, k1, k2);
        } else{
            printinrange(root.right, k1, k2);
        }
    }
    public static void printpath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("null");
    }

    public static void print2rootpath(Node root, ArrayList<Integer> path){
        if(root == null ){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printpath(path);
        }
        print2rootpath(root.left, path);
        print2rootpath(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValid(Node root, Node min, Node max){
        if(root == null ){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        } else if(max != null && root.data>= max.data){
            return false;
        }

        return isValid(root.left, min, root)
                    && isValid(root.right, root, max);
    }
    public static Node mirror(Node root){
        if(root == null){
            return null;
        }
       Node leftsubtree = mirror(root.left);
       Node rightsubtree = mirror(root.right); 
        root.left = rightsubtree;
        root.right = leftsubtree;
        return root;
    }
    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11};
        Node root = null;

        for(int i = 0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        // if(search(root, 6)){
        //     System.out.println("key found");
        // } else {
        //     System.out.println("key not foound");
        // }

        // root = delete(root, 10);
        // System.out.println();
        // inorder(root);

       // printinrange(root, 2, 15);

    //    ArrayList<Integer> path = new ArrayList<>();
    //    print2rootpath(root, path);

            if(isValid(root, null, null)){
                System.out.println("is valid bst");
            } else {
                System.out.println("is invalid bst");
            }
    }
    
}
