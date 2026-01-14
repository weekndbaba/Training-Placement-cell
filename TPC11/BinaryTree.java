package TPC11;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}


public class BinaryTree {
    Node root;

    public Node insertNode(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left =  insertNode(root.left, data);
           
        }else{
           root.right = insertNode(root.right, data);
        }
        return root;
    }

    public void preorder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }

    public int max_level(Node root){
        if(root == null) return 0;

        int level_sum = max_level(root.left) + max_level(root.right); 

        return 
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] values = {50,30,20,40,70,60,80};
        for(int val:values){
            tree.root = tree.insertNode(tree.root, val);
        }
        System.out.println("Inorder traversal");
        tree.inorder(tree.root);

        System.out.println("Postorder traversal");
        tree.postorder(tree.root);

        System.out.println("Prerder traversal");
        tree.preorder(tree.root);
    }

     
}
