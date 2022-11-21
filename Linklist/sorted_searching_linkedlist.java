class Node {
      int info;
      Node link;
}
class LinkedList {
      Node start = new Node();
}
class sorted_searching_linkedlist {
      public static void main(String args[]) {
            LinkedList z = new LinkedList();

            Node a = new Node(); Node b = new Node();
            Node c = new Node();  Node d = new Node();
           
            z.start = a;
            a.info = 10; a.link = b;
            b.info = 20; b.link = c;
            c.info = 30; c.link = d;
            d.info = 40; d.link = null;

             // item to search
            int item = 40;
            Node ptr = new Node();
            ptr = z.start;

            // for loop method           
            while (ptr!= null) {
                  if (item > ptr.info) {
                        ptr = ptr.link;
                  } 
                  else if (item == ptr.info) {
                        System.out.println("Value found!");
                        return;
                  } else {
                        System.out.println("Value not found!");
                        return;
                  }
            }
            System.out.println("Value not found"); // if the value is larger than the linkedlist values
      }
}