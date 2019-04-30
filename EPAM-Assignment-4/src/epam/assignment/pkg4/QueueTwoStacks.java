/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam.assignment.pkg4;

import java.io.*;
import java.util.*;

public class QueueTwoStacks {

    static Stack<Integer> stack1 = new Stack<>(); 
    static Stack<Integer> stack2 = new Stack<>();
  
    /* Function to push an item to stack*/
    static void push(Stack<Integer> top_ref, int new_data) 
    { 
        // Push the data onto the stack 
        top_ref.push(new_data); 
    } 
  
    /* Function to pop an item from stack*/
    static int pop(Stack<Integer> top_ref) 
    { 
        /*If stack is empty then error */
        if (top_ref.isEmpty()) { 
            //System.out.println("Stack Underflow"); 
            System.exit(0); 
        } 
  
        // pop the data from the stack 
        return top_ref.pop(); 
    } 
  
    // Function to enqueue an item to the queue 
    static void enQueue( int x) 
    { 
        push(stack1, x); 
    } 
  
    static void printEle()
    {
        int x; 
  
        /* If both stacks are empty then error */
        if (stack1.isEmpty() && stack2.isEmpty()) { 
            //System.out.println("Q is empty"); 
            System.exit(0); 
        } 
  
        /* Move elements from stack1 to stack 2 only if 
        stack2 is empty */
        if (stack2.isEmpty()) { 
            while (!stack1.isEmpty()) { 
                x= pop(stack1); 
                push(stack2, x); 
            } 
        } 
         x= stack2.peek(); 
        System.out.println(x); 
    }
    /* Function to deQueue an item from queue */
   static int deQueue() 
    { 
        int x; 
  
        /* If both stacks are empty then error */
        if (stack1.isEmpty() && stack2.isEmpty()) { 
            //System.out.println("Q is empty"); 
            System.exit(0); 
        } 
  
        /* Move elements from stack1 to stack 2 only if 
        stack2 is empty */
        if (stack2.isEmpty()) { 
            while (!stack1.isEmpty()) { 
                x = pop(stack1); 
                push(stack2, x); 
            } 
        } 
        
        x = pop(stack2); 
        return x; 
    } 

    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q= Integer.parseInt(br.readLine());
        while(q--!=0)
        {
            String[] s= br.readLine().split(" ");
            if(s.length==2)
            {
                int x= Integer.parseInt(s[1]);
                enQueue(x);
            }
            else if(s[0].equals("2"))
            {
              int p= deQueue();  
            }
            else
            {
                printEle();
            }
        }
    
    }
}
