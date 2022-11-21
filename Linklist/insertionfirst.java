class Node {
  int info;
  Node link;
}
class LinkedList {
  Node start = new Node();
}
class insertionfirst {
  public static void main(String args[]) {
    LinkedList z = new LinkedList();
    Node a = new Node(); Node b = new Node();
    Node c = new Node(); Node d = new Node();

    z.start = a;
    a.info = 20; a.link = b;
    b.info = 30; b.link = c;
    c.info = 40; c.link = d;
    d.info = 50; d.link = null;

    Node ptr = new Node();
    for (ptr = z.start; ptr != null; ptr = ptr.link) {
      System.out.print(ptr.info + " ");
    } 
      System.out.println();

    Node temp = new Node();
    Node NewNode = new Node();

    NewNode.info = 10;
    
    temp = z.start; // temp will store the start value temporary
    z.start = NewNode; // main logic
    NewNode.link = temp; 

    for (ptr = z.start; ptr != null; ptr = ptr.link) {
      System.out.print(ptr.info + " ");
    }
  }
}