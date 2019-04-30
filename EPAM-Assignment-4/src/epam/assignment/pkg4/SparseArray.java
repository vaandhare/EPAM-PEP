package epam.assignment.pkg4;

import java.util.*;

/**
 *
 * @author Andhare
 */
public class SparseArray {
  
    // function which counts the occurence
    static int count(String[] s, String str )
    {
        int cnt=0;
        for(int i=0;i<s.length;i++)
        {
          if(s[i].equals(str))
          {
          cnt++;
          }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Reading length of array
        int n= sc.nextInt();
        String[] a= new String[n];
        //Reading array of strings
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        //Reading numer of queries
        int q = sc.nextInt();
        for(int j=0;j<q;j++)
        {
            String s=sc.next();
            System.out.println(count(a,s));
        }
    }
}
