public class MaxMin {
    static int tree[];
    public static void init(int n){
        tree=new int[4*n];
    }
    public static void buildST(int i,int si,int sj,int arr[]){
if(si==sj){
    tree[i]=arr[si];
    return ;
}
        int mid=(si+sj)/2;
        buildST(2*i+1,si,mid,arr);
        buildST(2*i+2,mid+1,sj,arr);
        tree[i]=Math.max(tree[2*i+1],tree[2*i+2]);
    }
    public static int getMax(int arrr[],int qi,int qj){
               int n=arrr.length;
             return   getmaxutill(0,0,n-1,qi,qj);
    }
    public static int  getmaxutill(int i,int si,int sj,int qi,int qj){
               if(si>qj||sj<qi){
                return Integer.MIN_VALUE;
               }
               else if(si>=qi &&sj<=qj){
                return tree[i];
               }
               else{
                int mid=(si+sj)/2;
              int leftans=getmaxutill(2*i+1,si,mid,qi,qj);
                int rightans=getmaxutill(2*i+2,mid+1,sj,qi,qj);
                return Math.max(leftans,rightans);

               }
    }
    public static void update(int arr[],int idx,int newVal){
        arr[idx]=newVal;
        int n=arr.length;
        updateUtill(0,0,n-1,idx,newVal);
    }
    public static void updateUtill(int i,int si,int sj,int idx,int newVal){
        if(idx<si||idx>sj){
            return ;
        }
        if(si==sj){
            tree[i]=newVal;
        }if(si !=sj){
        tree[i]=Math.max(tree[i],newVal);
        int mid=(si+sj)/2;
        updateUtill(2*i+1,si,mid, idx, newVal);
        updateUtill(2*i+2,mid+1,sj, idx, newVal);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,-1,2,17,1,1,3,2,4};
        int n=arr.length;
        init(n);
        buildST(0,0,n-1,arr);
    for(int i=0;i<tree.length;i++){
          System.out.print(tree[i]+" ");
          
      }
        int max= getMax(arr, 2, 5);
        System.out.println(max);
       update(arr,2,20);
        max=getMax(arr, 2, 5);
        System.out.println( max);
    }
}
