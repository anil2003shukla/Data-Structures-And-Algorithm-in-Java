public class BuildBinarySearchTree{
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int n){
        if(root==null){
            root=new Node(n);
            return root;
        }
        if(root.data>n){
            //left suntree
           root.left= insert(root.left,n);
        }
        else{
            //right subtree
            root.right=insert(root.right,n);
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
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
    }
}