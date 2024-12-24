class BST{
    public static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }


    public static int size(Node root){
        if(root == null){
            return 0;
        }
        return size(root.left) + size(root.right)+1;

    }


    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        return sum(root.left)+sum(root.right)+root.data;
    }


    public static void display(Node root){
        if(root == null) return;
        if(root.right == null || root.left == null) System.out.println();
        System.out.print(root.data+"->");
        if(root.left != null) {
        System.out.print(root.left.data+",");
        }
        if(root.right != null){
        System.out.println(root.right.data);
        } 
        display(root.left);
        display(root.right); 
        System.out.println();  
     }


     public static void Inorder(Node root){
        if(root == null) return;
        Inorder(root.left);
        System.out.print(root.data+",");  
        Inorder(root.right);
     }


    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(3);
        root.left = a;
        Node b = new Node(4);
        root.right = b;
        Node c = new Node(5);
        Node d = new Node(6);
        a.left = c;
        a.right = d;
        Node e = new Node(7);
        Node f = new Node(8);
        b.left = e;
        b.right = f;
        display(root);
        Inorder(root);
        System.out.println();
        System.out.println("The number of elements in the binary tree are :"+size(root));
        System.out.println("The sum of elements in the binary tree are :"+sum(root));
    }

}
