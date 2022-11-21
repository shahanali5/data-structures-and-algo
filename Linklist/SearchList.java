class Node {
    int info;
    Node link;
}
class Linklist{
    Node start = new Node();
}

class SearchList {
    public static void main(String[] args) {
        Linklist list = new Linklist();

        Node a = new Node(); Node b = new Node();
        Node c = new Node(); Node d = new Node();
        
        list.start = a;

        a.info = 10; a.link = b;
        b.info = 20; b.link = c;
        c.info = 30; c.link = d;
        d.info = 40; d.link = null;

        //1st Step -> Create Pointer
        Node ptr = new Node();
        //initialize pointer
        ptr = list.start;
        int loc = 0;            //counter
        int item = 340;          //item is to be searched
        //2nd Step -> Repeat while;
        while (ptr != null) {
            //3rd Step -> Successful?
            if (ptr.info == item) {
                System.out.print("Item found at Node: "+loc);
                return;
            }
            //Search in next Node
            else
                ptr = ptr.link; //ptr now points to next node
                loc++;          //Increment index
        }
        //4th Step -> Set Item not found
        System.out.println("Item not Found.");
    }
}