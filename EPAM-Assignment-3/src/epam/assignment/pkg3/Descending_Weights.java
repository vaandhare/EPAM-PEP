package epam.assignment.pkg3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Andhare
 */
public class Descending_Weights {

    public static void main(String args[] ){
        int n, k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();
        ArrayList<ArrayList<Integer> > arr = new ArrayList<ArrayList<Integer> >(k); 
        for(int i=0; i<k; i++){
            ArrayList<Integer> arr2 = new ArrayList<Integer>();
            arr.add(arr2);
        }
        for(int i=0; i<n; i++){
            int a=s.nextInt();
            arr.get(a%k).add(a);
        }
        for(int i=k-1; i>=0; i--){
            Collections.sort(arr.get(i));
            for(int j=0;j<arr.get(i).size();j++)
                System.out.print(arr.get(i).get(j)+" ");
        }
    }    
}
