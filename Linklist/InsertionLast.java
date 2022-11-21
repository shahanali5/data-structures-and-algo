class Node {
  int info;
  Node link;
}

class InsertionLast {
  public static void main(String args[]) {
    Node start = new Node();

    Node a = new Node(); Node b = new Node();
    Node c = new Node(); Node d = new Node();

    start = a;
    a.info = 10; a.link = b;
    b.info = 20; b.link = c;
    c.info = 30; c.link = d;
    d.info = 40; d.link = null;

    Node pt = new Node();
    for (pt = start; pt != null; pt = pt.link) {
      System.out.print(pt.info + " ");
    }

    Node ptr = new Node();
    ptr = start;
    while (ptr.link != null) {
      ptr = ptr.link;
    }

    System.out.println();
    Node New = new Node();
    New.info = 50;
    ptr.link = New;

    Node prt = new Node();
    for (prt = start; prt != null; prt = prt.link) {
      System.out.print(prt.info + " ");
    }
  }
}