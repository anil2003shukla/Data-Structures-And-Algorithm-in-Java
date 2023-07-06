public class HeightOfTheTree {
    public static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }

    }
    public static int height(Node root){
    if(root==null){
        return 0;
    }
    int lefth=height(root.left);
    int righth=height(root.right);
    int Heightoftree=Math.max(lefth,righth)+1;
    return Heightoftree;
    }
public static void main(String[] args) {
     Node root=new Node(1);
     root.left=new Node(2);
     root.right=new Node(3);
     root.left.left=new Node(4);
     root.left.right=new Node(5);
     root.right.left=new Node(6);
     root.right.right=new Node(7);
   System.out.println( "Height of the tree is ="+height(root));
}
}
