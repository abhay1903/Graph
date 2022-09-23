/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
	public List<Integer> bfs(int v,int[][] adj)
	{
	     boolean[] vis = new boolean[v];
	     
	     for(int i=0;i<v;i++)
	          vis[i]=false;
	          
	    List<Integer> bfs = new ArrayList<>();
	    for(int i=0;i<v;i++)
	    {
	         if(vis[i]==false)
	         {
	              Queue<Integer> q = new LinkedList<>();
	              q.add(i);
	              vis[i]=true;
	              
	              while(!q.isEmpty())
	              {
	                   int node = q.poll();
	                   bfs.add(node);
	                   
	                   for(int i=0;i<v;i++)
	                   {
	                        if(adj[node][i]==1 && vis[i]==false)
	                        {
	                             q.add(i);
	                             vis[i]=true;
	                        }
	                   }
	              }
	         }
	    }
	    
	    return bfs;
	}
}
