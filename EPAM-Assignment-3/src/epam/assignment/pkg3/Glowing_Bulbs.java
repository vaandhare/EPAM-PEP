/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam.assignment.pkg3;

/**
 *
 * @author Andhare
 */
import java.util.*;

public class Glowing_Bulbs {
    static char[] ch;
    static ArrayList<Integer> Num;
    static long check(long mid){
        long res=0;
        for(int i=1;i<Math.pow(2,Num.size());i++){
            int ch=i;int index=0;int pro=1;int inc=0;
            while(ch!=0){
                if((ch&1)>0){
                    pro=pro*Num.get(index);
                    inc++;
                }
                    index++;ch=ch>>1;
            }
            
                if(inc%2==0)
                    res-=mid/pro;
                    else res+=mid/pro;
        }
        return res;
    }
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        
        while(true){
            if(count==0){
                break;
            }
            count--;
            
            ch = sc.next().toCharArray();           
            long k = sc.nextInt();
            
            Num = new ArrayList<Integer>();
            for(int i=0; i<ch.length; i++)
            if(ch[i] == '1')
            Num.add( i+1 );

            long result = 0;
            long low = 1,high = (long) Math.pow(10,15);
            high = 37 * high;
            while(low <= high){
                 long mid = (low + high)/2;
                 long val = check(mid);
                if(val >= k){
                    result = mid;
                    high = mid-1;}
                else low = mid+1;
            }
            System.out.println(result);
        }
    }   
}