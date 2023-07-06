public class MinmumDISTBetweenNodes {
    public static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }

    }
    public static Node lca2(Node root,int n1,int n2){
       
        if( root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca=lca2(root.left,n1,n2);
        Node rightlca=lca2(root.right,n1,n2);
        //leftlca=val rightlca=null;
        if(rightlca==null){
            return leftlca;
        }
         if(leftlca==null){
            return rightlca;
        }
        return root;
    }
    public static int lcaDist(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftdist=lcaDist(root.left,n);
        int rightdist=lcaDist(root.right,n);
        if(leftdist==-1 &&rightdist==-1){
            return -1;
        }
        else if(leftdist==-1) {
          return rightdist+1;
        }
        else{
            return leftdist+1;
        }
    }
    public static int minDist(Node root,int n1,int n2){
        Node lca=lca2(root,n1,n2);
      int  Dist1=lcaDist(lca ,n1);
      int Dist2=lcaDist(lca,n2);
      return Dist1+Dist2;
    }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        int n1=4,n2=7;
      System.out.println( "Min Dist betwwen Nodes="+minDist(root,n1,n2));
   }
   
}
