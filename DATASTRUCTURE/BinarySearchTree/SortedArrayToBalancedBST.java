public class SortedArrayToBalancedBST {
    static class Node {
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public static Node creatBST( int arr[],int st,int end){
    if(st>end){
      return null;
    }
    int mid=(st+end)/2;
 Node   root=new Node(arr[mid]);
   root.left=creatBST(arr,st,mid-1);
   root.right=creatBST(arr,mid+1,end);
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
        
        int arr[]={3,5,6,8,10,11,12};
       Node root= creatBST(arr,0,arr.length-1);
       preorder(root);
       System.out.println();
       
    }
}
