import java.util.*;
import java.io.*;
public class FindTheMaximuimOrMinimum {
    




    long first, second;  
    public FindTheMaximuimOrMinimum(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); 
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Comput obj = new Comput();
            FindTheMaximuimOrMinimum product = obj.getMinMax(a, n); 
            System.out.println(product.first+" "+product.second);
            
        }
	}
}




class Comput 
{
    static FindTheMaximuimOrMinimum getMinMax(long a[],  long n)  
    {
        //Write your code here
        long min=a[0];
        long max=a[0];
        for(int i=0;i<a.length;i++){
            min=Math.min(a[i],min);
            max=Math.max(a[i],max);

        }
        return  new FindTheMaximuimOrMinimum(max,min);
    }
}


