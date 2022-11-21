
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
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        a.info = 10; a.link = b;
        b.info = 20; b.link = c;
        c.info = 30; c.link = d;
        d.info = 40; d.link = null;

        list.start = a;

        //1st Step -> Create Pointer
        Node ptr = new Node();
        //initialize pointer
        ptr = list.start;
        int loc = 0;            //counter
        int item = 2340;          //item is to be searched

        //2nd Step -> Repeat while;
        while (ptr != null) {
		if(item > ptr.info) {
			ptr = ptr.link;
			loc++;
		}
        	else if (ptr.info == item) {
                	System.out.print("Item found at Node: "+loc);
                	return;
        	}
        	else {
        	    	System.out.print("Item not Found.");
			return;   
		}
        }
        
	//3rd Step -> Set Item not found and exit
        System.out.println("Item not Found....");
    }
}
