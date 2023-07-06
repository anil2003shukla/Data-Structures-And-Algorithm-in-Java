import java.util.*;
public class ImplementHashMap {
     public static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;//n
        private int  N;
        private LinkedList<Node> bucket[];//N=buckets.length
       // @SuppressWarnings("unchecked")
        public HashMap(){ 
            this.N=4;
            this.bucket=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.bucket[i]=new LinkedList<>();
            }
        }
        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll=bucket[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        private int hashFunction(K key){
              int hc=key.hashCode();
              //1234567 -123446577
              return  Math.abs(hc)%N;
              
        }
      //  @SuppressWarnings("unchecked")
        private void rehash(){
           LinkedList<Node> oldbacket[]=bucket;
           bucket=new LinkedList[N*2];
           N=2*N; 
           for(int i=0;i<bucket.length;i++){
            bucket[i]=new LinkedList<>();
           }
           //nodes->add om bucket
           for(int i=0;i<oldbacket.length;i++){
            LinkedList<Node> ll=oldbacket[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.remove();
                put(node.key,node.value);
            }

           }
          
        }
        public void put(K key,V value){
           int bi= hashFunction(key);// 0 to bucket.size
           int di=SearchInLL(key,bi);//valid indx; -1
           if(di!=-1){
            Node node=bucket[bi].get(di);
            node.value=value;
           }
           else{
            bucket[bi].add(new Node(key,value));
            n++;
           }
           double lambda=(double)n/N;
           if(lambda>2.0){
            rehash();
           }
        }
        public boolean containsKey(K key){
            int bi= hashFunction(key);// 0 to bucket.size
           int di=SearchInLL(key,bi);//valid indx; -1
           if(di!=-1){
           return true;
           }
           else{
           return false;
           }

        }
        public V get(K key){
            int bi= hashFunction(key);// 0 to bucket.size
           int di=SearchInLL(key,bi);//valid indx; -1
           if(di!=-1){
            Node node=bucket[bi].get(di);
           return node.value;
           }
           else{
           return null;
           }
        }
        public V remove(K key){
            int bi= hashFunction(key);// 0 to bucket.size
           int di=SearchInLL(key,bi);//valid indx; -1
           if(di!=-1){
            Node node=bucket[bi].remove(di);
            n--;
           return node.value;
           }
           else{
           return null;
           } 
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<bucket.length;i++){
                LinkedList<Node> ll=bucket[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
     }
     public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap();
        hm.put("India",100);
        hm.put("china",150);
        hm.put("USA",5090);
        hm.put("america",456);
        System.out.println(hm.remove("India"));
    ArrayList<String> s=hm.keySet();
    for(String kes:s){
        System.out.println(kes);
    }
    }
}
