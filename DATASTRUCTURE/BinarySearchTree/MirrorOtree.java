public class MirrorOtree {
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node createMirror(Node root){
        if(root== null){
               return null;
        }
        Node leftSubtree=createMirror(root.left);
        Node rightSubtree=createMirror(root.right);
        root.left=rightSubtree;
        root.right=leftSubtree;
        return root;
    }
    public static void preorder(Node root){
        if(root==null){
            return ;

        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
       /*8                           8
        /\                          / \
       5  10       mirror          10  5
       /\   \                      /  / \
      3  6   11                  11  3   6
       
        */ 
       Node root=new Node((8));
       root.left=new Node (5);
       root.right=new Node(10);
       root.left.left=new Node(3);
       root.left.right=new Node(6);
       root.right.right=new Node(11);
       createMirror(root);
       preorder(root);
       System.out.println();
       

    }
}
