import java.util.*;
public class TofindLowestCommonAncestor {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
           
    } 
    public static Node lca(Node root,int n1,int n2){
         ArrayList<Node> p1=new ArrayList<>();
         ArrayList<Node> p2=new ArrayList<>();
                   getpath(root,n1,p1);
                   getpath(root,n2,p2);
                   //last common ancestor
                   int i=0;
                   for(;i<p1.size() && i<p2.size();i++){
                    if(p1.get(i) !=p2.get(i)){
                        break;
                    }
                   }
                   //my lca equal to node-> i-1th
                   Node lca=p1.get(i-1);
                   return lca;
    }
    public static boolean getpath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
           }     
        
        path.add(root);
              if(root.data==n){
                return true;
              }
              boolean foundleft=getpath(root.left,n,path);
              boolean foundright=getpath(root.right,n,path);
              if(foundleft|| foundright){
                return true;  
                      }
                      path.remove(path.size()-1);
                      return false;
    }
    //Second Approach
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
    public static void main(String[] args) {
    Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
       int n1=4,n2=5;
     System.out.println(lca(root,n1,n2).data);
        System.out.println(lca2(root,n1,n2).data);
    }
}
