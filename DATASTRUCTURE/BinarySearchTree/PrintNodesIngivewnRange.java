public class PrintNodesIngivewnRange {
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
    public static void PrintRange(Node root,int k1,int k2){
        if(root==null){
            return ;
        }
        if(root.data>=k1&&root.data<=k2){
            PrintRange(root.left,k1,k2);
            System.out.println(root.data+" ");
            PrintRange(root.right,k1,k2);
        }
        else if(root.data<k1){
            PrintRange(root.left,k1,k2);
        }
        else{
            PrintRange(root.right,k1,k2);
        }
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        PrintRange(root,5,12);
    } 
}
