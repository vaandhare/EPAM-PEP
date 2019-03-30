
package epam.assignment.pkg3;

import java.util.*;

/**
 * @author Andhare
 */
public class Cutting_Rod_Problem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i< n ; i++)
        {
            int count = 1;
            int RodLength = sc.nextInt();
            while(Math.pow(2,count)-1<=RodLength){
                count++;
            }
            System.out.println(count-2);
        }
    }
    
}
