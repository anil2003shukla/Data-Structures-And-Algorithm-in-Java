
import java.util.*;
public class ConvertBSTtoBALANCEDBST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    public static void preorder(Node root)
    {
        if(root==null){
            return; 
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    
    public static void inorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return ;
        }
       
        inorder(root.left,inorder);
        inorder.add(root.data);
        inorder(root.right,inorder);
    }
    public static Node createbalancedBST(ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createbalancedBST(inorder,st,mid-1);
        root.right=createbalancedBST(inorder,mid+1,end);
        return root;
    }
    public static Node balancedBST(Node root){
        if(root==null){
            return null;
        }
        //inorder seq
        ArrayList<Integer> inorder=new ArrayList<>();
        inorder(root,inorder);
     //sorted inorder ->balanced BST
     root=createbalancedBST(inorder,0,inorder.size()-1);
     return root;
    }

    public static void main(String[] args) {
        /*
        
              8
   actual    / \
            6    10
           /      \
          5        11
         /          \
        3            12

expected   8
          / \
         5   11
        / \   /\
       3   6 10  12
         */
        Node root=new Node(8 );
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
       root=balancedBST(root);
       preorder(root);
       System.out.println();
    }
}
