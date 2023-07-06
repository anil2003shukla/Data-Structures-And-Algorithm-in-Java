import java.util.*;
public class NearByCars {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distsq;
        int indx;
        public Point(int x,int y,int distsq,int indx){
            this.x=x;
            this.y=y;
            this.distsq=distsq;
            this.indx=indx;

        }
        @Override
        public int compareTo(Point p2){
              return this.distsq-p2.distsq;
        }
    }
    public static void main(String args[]){
        int pnts[][]={ {3,3},{5,-1},{-2,4} };
        int k=2;
        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<pnts.length;i++){
            int distsq=pnts[i][0]*pnts[i][0]+pnts[i][1]*pnts[i][1];
            pq.add(new Point(pnts[i][0],pnts[i][1],distsq,i));
        }
        //nearest K cars
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().indx);
        }
    }
}
