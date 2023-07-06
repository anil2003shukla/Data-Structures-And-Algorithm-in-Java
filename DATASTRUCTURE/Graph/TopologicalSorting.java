import java.util.*;
public class TopologicalSorting {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
        src=s;
        dest=d;
        }
    }
    public static  void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,3));
       

    }
    public static void topSort(ArrayList<Edge>[]graph){
    boolean vis[]=new boolean[graph.length];
    Stack<Integer> s=new Stack<>();
    for(int i=0;i<graph.length;i++){
        if(!vis[i]){
            topSortUtil(graph,i,s,vis);//modified dfs
        }
    }
    while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
        
    }
    }
    public static void  topSortUtil(ArrayList<Edge>[]graph,int curr,Stack<Integer> s,boolean vis[]){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
           if(!vis[e.dest]){
            topSortUtil(graph,e.dest,s,vis);
           } 
        }
           s.push(curr);
    }
    public static void main(String[] args) {
       int v=4;
       ArrayList<Edge>[] graph=new ArrayList[v];
       createGraph(graph);
      topSort(graph);
    }
}
