public class DiameterOfBinaryTreee {
   
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
        public static int Diameter(Node root){
            if(root==null){
                return 0;
            }
            int leftDiam=Diameter(root.left);
          int   leftht=height(root.left);
            int rightDiam=Diameter(root.right);
            int rightht=height(root.right);
            int selfDiam=leftht+rightht+1;
         return   Math.max(selfDiam,Math.max(leftDiam,rightDiam));

        }
        static class info{
            int diam;
            int ht;
            public info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;

            }
        }
        public static info diameter1(Node root ){
            if(root==null){
                return new info(0,0);
            }
        info leftinfo=diameter1(root.left);  
        info rightinfo=diameter1(root.right);
   int diam=Math.max(leftinfo.diam,Math.max(rightinfo.diam,leftinfo.ht+rightinfo.ht+1));
   int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;
   return new info(diam,ht);
        }
    public static void main(String[] args) {
         Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
       root.right.right=new Node(7);
       System.out.println( "Height of the tree is ="+diameter1(root).ht);
    }
    }

