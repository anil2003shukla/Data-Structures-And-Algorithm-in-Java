public class SizeOfLargestBSTInBT {
    static class Node{
        int data;
        Node left,right;

    
    public Node(int data){
        this.left=null;
        this.right=null;
        this.data=data;
}
}
static class info{
    boolean isbst;
    int size;
    int min,max;
    public info(boolean isbst,int size,int min,int max){
        this.isbst=isbst;
        this.size=size;
        this.min=min;
        this.max=max;

    }
}
static int maxbst=0;
public static info largestbst(Node root){
    if(root==null){
        return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
   
    }
   info leftinfo= largestbst(root.left);
   info rightinfo=largestbst(root.right);
   int size=leftinfo.size+rightinfo.size+1;
   int min=Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
   int max=Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));

   if(root.data<=leftinfo.max||root.data>=rightinfo.min){
    return new info(false,size,min,max);
   }
   if(leftinfo.isbst && rightinfo.isbst){
    maxbst=Math.max(maxbst,size);
    return new info(true,size,min,max);
   }
   return new info(false,size,min,max);
}
public static void main(String[] args) {
    Node root=new Node(50);
    root.left=new Node(30);
    root.left.left=new Node(5);
    root.left.right=new Node(20);
    root.right=new Node(60);
    root.right.left=new Node(45);
    root.right.right=new Node(70);
    root.right.right.left=new Node(65);
    root.right.right.right=new Node(80);
    info Info=largestbst(root);
    System.out.println("largest bst size="+maxbst);
}
}
