// See the Cormen book for details of the following algorithm 
class MatrixChainMultiplication 
{ 
    final static int INF = 99999, V = 5; 
    // Matrix Ai has dimension p[i-1] x p[i] for i = 1..n 
    static int MatrixChainOrder(int p[], int n) 
    { 
        /* For simplicity of the program, one extra row and one 
        extra column are allocated in m[][].  0th row and 0th 
        column of m[][] are not used */
        int m[][] = new int[n][n]; 
  
        int i, j, k, L, q; 
  
        /* m[i,j] = Minimum number of scalar multiplications needed 
        to compute the matrix A[i]A[i+1]...A[j] = A[i..j] where 
        dimension of A[i] is p[i-1] x p[i] */
  
        // cost is zero when multiplying one matrix. 
        for (i = 1; i < n; i++) 
            m[i][i] = 0; 
  
        // L is chain length. 
        for (L=2; L<n; L++) 
        { 
            for (i=1; i<n-L+1; i++) 
            { 
                j = i+L-1; 
                if(j == n) continue; 
                m[i][j] = Integer.MAX_VALUE; 
                for (k=i; k<=j-1; k++) 
                { 
                    // q = cost/scalar multiplications 
                    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j]; 
                    if (q < m[i][j]) 
                        m[i][j] = q; 
                } 
            }
	    printSolution(m, L);
        } 
  
        return m[1][n-1]; 
    } 
  
    // Driver program to test above function 
    public static void main(String args[]) 
    { 
        int arr[] = new int[] {10,20, 30, 40, 50}; //Four matrices
        int size = arr.length; 
	for (int i = 0; i < size -1; i++)
	    {
		System.out.format("A"+i+"["+arr[i]+"]["+arr[i+1]+"],");
	    }
	System.out.println("");
        System.out.println("Minimum number of multiplications is "+ 
                           MatrixChainOrder(arr, size)); 
    }

    static void printSolution(int array[][], int iC)
    {
	String labels ="0123456789abcdef";
	//print column headers
	System.out.println("i:" + iC ); //",j:" + jC + ",k:" +kC);
	System.out.format("  ");
	for (int i = 0; i < V; ++i)
	    System.out.format("     "+labels.charAt(i));
	System.out.println(" ");
	//now print the matrix	
        for (int i=0; i<V; ++i) 
        {
	    System.out.format( labels.charAt(i)+" "); //print row labels
            for (int j=0; j<V; ++j) 
            { 
                if (array[i][j]==Integer.MAX_VALUE) 
                    System.out.print("   INF"); 
                else
                    System.out.format("%6d", array[i][j]); 
            } 
            System.out.println(); 
        } 
    } 

} 
/* This code is contributed by Rajat Mishra*/
