/*
Valid index of array bookmark_border
Write a program to check whether the indexes given are valid index are not. Print "Out of Bounds" if any attempt is made to refer to an element whose index is beyond the array size , else print the element present at the index.

Input Format

The first line of input contains n , denoting the size of array.
The second line contains n spaced integers , denoting elements of array 
The third line contains q, denoting number of queries
Next q lines contains an integer, index, which is to be tested.
Output Format

For each query print the value at index if the index is a valid index , else print "Out of Bounds".
Sample Input

10			// Size of array
1 2 3 4 5 6 7 8 9 10	// array elements
2 // No. Of Queries
4		// index to be retrieved
13		// index to be retrieved
Sample Output

5
Out of Bounds
 */

import java.util.Scanner;

/**
 * customError
 */
class customError extends Exception{
    public customError()
    {
        super("Invalid Index motherfucker");
    }
    
}

public class v_Valid_index_of_array 
{
    public static void checkValidIndex(int ind , int[] arr , int size) throws customError
    {
        if(ind < 0 || ind >= size)
        {
            throw new customError();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++)
        {
            int x = sc.nextInt();
            arr[i] = x;
        }
        int noOfQueries = sc.nextInt();
        while (noOfQueries-->0) {
            int ind = sc.nextInt();
            try
            {
                checkValidIndex(ind, arr, size);
                System.out.println(arr[ind]);
            }
            catch (customError e){
                System.out.println("Out of Bounds");
            }
        }

        sc.close();
    }
}
