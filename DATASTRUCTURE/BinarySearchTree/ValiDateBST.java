public class ValiDateBST {
   
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
               root.left = insert(root.left,n);
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
        public static boolean isValiDate(Node root,Node min,Node max){
            if(root==null){
                return true;
            }
            if(min!=null&&root.data<=min.data){
                return false;
            }
          else  if(max!=null&&root.data>=max.data){
                return false;
            }
            return (isValiDate(root.left,min,root) && isValiDate( root.right,root,max));
        }
        public static void main(String[] args) {
            int values[]={1,1,1,};//{8,5,3,1,4,6,10,11,14};
            Node root=null;
            for(int i=0;i<values.length;i++){
                root=insert(root,values[i]);
            }
            inorder(root);
            System.out.println();
            if(isValiDate(root,null,null)){
                System.out.println("Tree is Valid");
            }
            else{
                System.out.println("invalid tree");
            }
        }
    }

