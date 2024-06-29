public class btree2 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) +1;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int lc = countNode(root.left);
        int rc = countNode(root.right);
        return lc+rc+1;
    }

    public static int sumNode(Node root){
        if(root == null){
            return 0;
        }
        int sumleft = sumNode(root.left);
        int sumright = sumNode(root.right);

        return sumleft+sumright+root.data;
    }
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftdia = diameter(root.left);
        int rightdia = diameter(root.right);
        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int selfdia = leftheight+rightheight+1;

        return Math.max(selfdia, Math.max(rightdia, leftdia));
    }

    public static void Klevel(Node root, int level, int K){
        if(root==null){
            return;
        }
        if(level==K){
            System.out.print(root.data+" ");
            return;
        }

        Klevel(root.left, level+1, K);
        Klevel(root.right, level+1, K);
    }

    public static int Kancestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }
        int leftdest = Kancestor(root.left, n, k);
        int rightdist = Kancestor(root.right, n, k);

        if(leftdest==-1 && rightdist == -1){
            return -1;
        }
        int max  = Math.max(leftdest, rightdist);

        if(max+1 == k){
            System.out.println(root.data);
        }

        return max+1;
    }
    public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int leftchild = transform(root.left);
        int rihgtchild = transform(root.right);

        int data = root.data;
        int newleft = root.left==null ? 0 :root.left.data;
        int newright = root.right == null ? 0: root.right.data;
        root.data = leftchild+newleft+rihgtchild+newright;

        return data;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data+" ");
       
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left= new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
       root.right.right = new Node(7);
        
        //int n=5, k=2;
       // Kancestor(root, n, k);
        transform(root);
        preorder(root);
        
        
       



        //Klevel(root, 1, K);
       // System.out.println(height(root));
      // System.out.println(countNode(root));
        //System.out.println(sumNode(root));
       // System.out.println(diameter(root));
    }
}
