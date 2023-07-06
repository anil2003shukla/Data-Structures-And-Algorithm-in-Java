import java.util.*;
import java.io.*;
import java.util.Collections;
public class BucketSort{
    public static void main(String args[]){
        float [] arr={.5f,.7f,.4f,.2f,.1f};
        bucketSort(arr);
       System.out.println(Arrays.toString(arr));
    }
    public static  void bucketSort(float arr[]){
        int n=arr.length;
        //buckets 
        ArrayList<Float>[] buckets=new ArrayList[n];
        //create emptry buckets
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
            int bucketindex=(int)arr[i]*n;
            //add elements in the bucket
            buckets[bucketindex].add(arr[i]);
        }
        //sort each bucket individual
        for(int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        // merge to all buckets to get final result
        int index=0;
        for(int i=0;i<buckets.length;i++){
            ArrayList<Float> currentBucket=buckets[i];
            for(int j=0;j<currentBucket.size();j++){
                arr[index++]=currentBucket.get(j);
            }

        }
    }
}