public class TraippedWter {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        System.out.println("traipped water="+traippedWater(arr));
    }
    public static int traippedWater(int height[]) {
        //calculate left max boundry -array and right max -boundry
         int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //right max boundry
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        // loop
        int traippedwater=0;
        for(int i=0;i<n;i++){
             //waterlevel=min(leftmaxboundry,rightmaxboundry)
          int waterlevel=Math.min(leftmax[i],rightmax[i]);
           //traippedwater=(waterlevel-height[i])

          traippedwater +=waterlevel-height[i];
        }
       
      return traippedwater; 
    }
}
