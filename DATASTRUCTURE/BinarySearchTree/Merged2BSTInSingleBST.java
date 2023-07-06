import java.util.*;
public class Merged2BSTInSingleBST {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
        }
        public static void inorder(Node root,ArrayList<Integer> inorder){
            if(root==null){
                return;
            }
            inorder(root.left,inorder);
            inorder.add(root.data);
            inorder(root.right,inorder);

        }
        public static Node createBST(ArrayList<Integer> arr,int st,int end){
          if(st>end){
            return null;
          }
            int mid=(st+end)/2;
            Node root=new Node(arr.get(mid));
            root.left=createBST(arr,st,mid-1);
            root.right=createBST(arr,mid+1,end);
             return root;
        }
        public static Node mergedbsts(Node root1,Node root2){
            ArrayList<Integer> arr1=new ArrayList<>();
          //step-1
            inorder(root1,arr1);
            //step-2
            ArrayList<Integer> arr2=new ArrayList<>();
            inorder(root2,arr2);
            //merged
            int i=0,j=0;
            ArrayList<Integer> finalarr=new ArrayList<>();
            while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalarr.add(arr1.get(i));
                i++;
            }
            else{
                finalarr.add(arr2.get(j));
                j++;
            }
            }
            while(i<arr1.size()){
                finalarr.add(arr1.get(i));
                i++;
            }
            while(j<arr2.size()){
                finalarr.add(arr2.get(j));
                j++;
            }
        //sorted Al ->to bsts
     return createBST(finalarr,0,finalarr.size()-1);

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
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
      Node   root=mergedbsts(root1, root2);
         preorder(root);
         System.out.println();
    }
}
