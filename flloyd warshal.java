/*
The problem is to find shortest distances between every pair of vertices in a given edge weighted directed Graph.
Example:

Input:
2
1
5

Output:
1
13
*/

import java.io.*;

class GFG {
    
    final static int INF = 99999;
    
    //Giving matrix as an i/p for Graph
    //indexes ~ vertices
    //data ~ weight
    public static void floyd (int graph[][],int V)
    {
        int asp[][]=new int[V][V];
        
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                asp[i][j]=graph[i][j];
            }
        }
            
    
        for(int k=0;k<V;k++)
        {
            for(int i=0;i<V;i++)
            {
                for(int j=0;j<V;j++)
                {
                    asp[i][j]=Math.min(asp[i][j],asp[i][k]+asp[k][j]);
                }
            }
        }
        printgraph(asp,V);
    }
    
    static void printgraph(int dist[][],int V) 
    { 
        System.out.println("The following matrix shows the shortest "+ 
                         "distances between every pair of vertices"); 
        for (int i=0; i<V; ++i) 
        { 
            for (int j=0; j<V; ++j) 
            { 
                if (dist[i][j]==INF) 
                    System.out.print("INF "); 
                else
                    System.out.print(dist[i][j]+"   "); 
            } 
            System.out.println(); 
        } 
    } 
	public static void main (String[] args) {
		System.out.println("GfG!");
		 int graph[][] = { {0,   5,  INF, 10}, 
                          {INF, 0,   3, INF}, 
                          {INF, INF, 0,   1}, 
                          {INF, INF, INF, 0} 
                        }; 
        // Print the solution 
        floyd(graph,4); 
	}
}