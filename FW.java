/* A Java program for Floyd Warshall All Pairs Shortest 
 * Path algorithm. 
 */
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
  
//class AllPairShortestPath
class FW
{ 
    final static int INF = 99999, V = 4; 
  
    void floydWarshall(int graph[][]) 
    { 
        int dist[][] = new int[V][V]; 
        int i, j, k; 
  
        /* Initialize the solution matrix same as input graph matrix. 
           Or we can say the initial values of shortest distances 
           are based on shortest paths considering no intermediate 
           vertex. */
        for (i = 0; i < V; i++) 
            for (j = 0; j < V; j++) 
                dist[i][j] = graph[i][j]; 
  
        /* Add all vertices one by one to the set of intermediate 
           vertices. 
          ---> Before start of an iteration, we have shortest 
               distances between all pairs of vertices such that 
               the shortest distances consider only the vertices in 
               set {0, 1, 2, .. k-1} as intermediate vertices. 
          ----> After the end of an iteration, vertex no. k is added 
                to the set of intermediate vertices and the set 
                becomes {0, 1, 2, .. k} */
        for (k = 0; k < V; k++) 
        { 
            // Pick all vertices as source one by one 
            for (i = 0; i < V; i++) 
            { 
                // Pick all vertices as destination for the 
                // above picked source 
                for (j = 0; j < V; j++) 
                { 
                    // If vertex k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (dist[i][k] + dist[k][j] < dist[i][j]) 
                        dist[i][j] = dist[i][k] + dist[k][j]; 
                } 
            }
	    printSolution(dist); // print each d(k)
        } 
  
        // Print the shortest distance matrix 
        printSolution(dist); 
    } 
  
    void printSolution(int dist[][]) 
    {
	String labels ="abcdefghijklm";
	//print column headers
	System.out.println("");
	System.out.format("  ");
	for (int i = 0; i < V; ++i)
	    System.out.format("   "+labels.charAt(i));
	System.out.println(" ");
	//now print the matrix	
        for (int i=0; i<V; ++i) 
        {
	    System.out.format( labels.charAt(i)+" "); //print row labels
            for (int j=0; j<V; ++j) 
            { 
                if (dist[i][j]==INF) 
                    System.out.print(" INF"); 
                else
                    System.out.format("%4d", dist[i][j]); 
            } 
            System.out.println(); 
        } 
    } 
  
    // Driver program to test above function 
    public static void main (String[] args) 
    { 
        /* Let us create the following weighted graph 
           Adjacency matrix of graph
	   \  a  b  c  d
	   a  0  -  3  -
	   b  2  0  -  -
	   c  -  7  0  1
	   d  6  -  -  0
       */
        int graph[][] = { {   0, INF,   3, INF}, 
                          {   2,   0, INF, INF}, 
                          { INF,   7,   0,   1}, 
                          {   6, INF, INF,   0} 
                        }; 

	        FW a = new FW(); 
  
        // Print the solution 
        a.floydWarshall(graph); 
    } 
} 
  
//based on code @ https://www.geeksforgeeks.org/floyd-warshall-algorithm-dp-16/
