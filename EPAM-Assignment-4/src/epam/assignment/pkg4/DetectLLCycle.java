package epam.assignment.pkg4;

import java.io.*;
import java.util.*;

/**
 *
 * @author Andhare
 */
public class DetectLLCycle {

    static class SinglyLLNode {
        public int data;
        public SinglyLLNode next;

        public SinglyLLNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLL {
        public SinglyLLNode head;
        public SinglyLLNode tail;

        public SinglyLL() {
            this.head = null;
            this.tail = null;
        }

        public void InsertNode(int nodeData) {
            SinglyLLNode node = new SinglyLLNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLL(SinglyLLNode node, String sep, BufferedWriter bw) throws IOException {
        while (node != null) {
            bw.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bw.write(sep);
            }
        }
    }

    static boolean hasCycle(SinglyLLNode head) {
       if(head == null || head.next == null)
         return false;
        else{
            SinglyLLNode temp = head;
            HashSet<SinglyLLNode> hs= new HashSet<>();
            while(temp!= null ){
                if(hs.contains(temp)){
                    return true;
                }
                hs.add(temp);
                temp = temp.next;
            }
            return false;
        }
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            int index = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLL llist = new SinglyLL();

            int LLCount = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < LLCount; i++) {
                int llistItem = sc.nextInt();
                sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.InsertNode(llistItem);
            }
          
            SinglyLLNode extra = new SinglyLLNode(-1);
            SinglyLLNode temp = llist.head;

            for (int i = 0; i < LLCount; i++) {
                if (i == index)
                    extra = temp;
                if (i != LLCount-1)
                    temp = temp.next;
            }
      
            temp.next = extra;

            boolean result = hasCycle(llist.head);

            bw.write(String.valueOf(result ? 1 : 0));
            bw.newLine();
        }

        bw.close();

        sc.close();
    }
}