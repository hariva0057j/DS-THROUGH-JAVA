

class BinaryST{
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            right = left = null;
        }
    }
    public static Node insert(Node root,int data){
       if(root == null){
        root = new Node(data);
        return root;
       }
       if(root.data > data){
       root.left =  insert(root.left,data);
       }
       else{
        root.right = insert(root.right,data);
       }
        return root;
    }
    public static void display(Node root){ // preorder
        if(root == null){
            return;
        }
            System.out.print(root.data+"->");
            if(root.left != null) System.out.print(root.left.data+",");
            if(root.right != null) System.out.print(root.right.data);
            System.out.println();
            display(root.left);
            display(root.right);
    }
    public static void display4(Node root){ // preorder(ANOTHER VERSION)
        if(root == null){
            return;
        }
            System.out.println(root.data);
            display4(root.left);
            display4(root.right);
    }
    public static void display2(Node root){ // Inorder
        if(root == null){
            return ;
        }
        display2(root.left);
        System.out.println(root.data);
        display2(root.right);
    } 
    public static void display3(Node root){ // Postorder
        if(root == null) {
            return ;
            }
        display3(root.left);
        display3(root.right);
        System.out.println(root.data);

    }
    public static void search(Node root,int key){
        if(root == null){
            System.out.println("Not found");
            return;
        }
        if(key < root.data){
            search(root.left,key);
        }
        else if(key > root.data){
            search(root.right,key);
        }
        else System.out.println("Found");

       } 
       public static Node delete(Node root, int data) {
    if (root == null) {
        return root;
    }

    if (data < root.data) {
        root.left = delete(root.left, data);
    } else if (data > root.data) {
        root.right = delete(root.right, data);
    } else {
        // Node to be deleted found
        if (root.left == null && root.right == null) {
            // Case 1: No child
            return null;
        } else if (root.left == null) {
            // Case 2: One child (right)
            return root.right;
        } else if (root.right == null) {
            // Case 2: One child (left)
            return root.left;
        } else {
            // Case 3: Two children
            Node val = inordersuccessor(root.right);
            root.data = val.data;
            root.right = delete(root.right, val.data);
        }
    }
    return root;
}

public static Node inordersuccessor(Node root) {
    while (root.left != null) {
        root = root.left;
    }
    return root;
}

    public static void main(String args[]){
        Node root = null;
        root = insert(root,12);
        root = insert(root,11);
        root = insert(root,32);
        root = insert(root,15);
        root = insert(root,100);
        System.out.println("The Preorder traversal of the tree is :");
        display(root);
        System.out.println();
        System.out.println("The Inorder traversal of the tree is : ");
        display2(root);
        System.out.println();
        System.out.println("The Postorder traversal of the tree is :");
        display3(root);
        System.out.println();
        System.out.println("The second Preorder traversal of the tree is :");
        display4(root);
        System.out.println();
        System.out.print("The value searched is : ");
        search(root,231);
        System.out.println();
        delete(root,12);
        System.out.println("After deletion tree is :");
        display4(root);

    }
}
