class Node{
    int INFO;
    Node LINK;
}
class Linkedlist{
    Node start = new Node();
}
public class Traversing {

        public static void main(String[] args) {
        Linkedlist Z = new Linkedlist();

        Node A = new Node(); Node B = new Node();
        Node C = new Node(); Node D = new Node();
        
        Z.start = A;
        A.INFO = 10; A.LINK = B;
        B.INFO = 20; B.LINK = C;
        C.INFO = 30; C.LINK = D;
        D.INFO = 40; D.LINK = null;
       
        Node ptr = new Node();
        ptr = Z.start;
        while(ptr!=null){
            System.out.print(ptr.INFO + " ");
          ptr = ptr.LINK;
        }
    }
}

// ALGORITHM
/* Here list is a LinkedList in memory. This algorithm traverse 
 the linkedlist.
1.[initialize ptr] set: ptr=start
2. Repeat step 2 and 3 while ptr!=null
3. [visit node] Apply Process data[ptr]
4. [go to next nod] set: ptr=link[ptr]
    [End of step 2 loop]
5. Exit */ 
