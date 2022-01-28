/*
Q4. Write a program to find and return the sum of all elements of the array. Do this recursively.
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7
 */
import java.util.Scanner;

public class Sum
{
    public static int m5(  int n,int[] arr)
    {
        if(n==0)
        {
            return arr[0];
        }
        int c=m5(n-1,arr)+arr[n];
        return c;
    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[s.nextInt()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(m5(arr.length-1,arr));
    }
}

