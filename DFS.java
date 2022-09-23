
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args)
	{
		
	}
	public List<Integer> dfsOfGraph(int v,List<List<Integer>> adj)
	{
	     boolean vis[] = new boolean[v];
	     List<Integer> storeDfs = new ArrayList<>();
	     for(int i=0;i<v;i++)
	     {
	          if(vis[i]==false)
	               dfs(i,vis,adj,storeDfs);
	     }
	     
	    return storeDfs;
	}
	public void dfs(int node,boolean[] vis,List<List<Integer>> adj,List<Integer> storeDfs)
	{
	     vis[node]=true;
	     storeDfs.add(node);
	     
	     for(Integer i:adj.get(node))
	     {
	          if(vis[i]==false)
	               dfs(i,vis,adj,storeDfs);
	     }

	}
}
