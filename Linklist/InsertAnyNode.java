class Node {
	int data;
	Node next;
}
class Linklist {
	Node start = new Node();
}
class InsertAnyNode {
	public static void main (String[] args) {

	Linklist list = new Linklist();
	Node a = new Node(); Node b = new Node();
	Node c = new Node(); Node d = new Node();

	list.start=a;
	a.data=10; b.data=20;
	c.data=30; d.data=40;
	a.next =b; b.next=c;
	c.next=d; d.next=null;

	//TRAVERSE:
	Node ptr = list.start;
	while(ptr != null) {
		System.out.print(ptr.data+" ");
		ptr=ptr.next;
	}
	System.out.println();

	//INSERTION: 
	ptr = list.start;
	int value = 20;
	
	//Step 1 -> Create new Node and insert data in it
	Node newNode = new Node();
	newNode.data = 25;

	//Step 2 -> Repeat while ptr not equals null
	while(ptr != null){
		//Step 3 -> check if data of ptr equals VALUE
		if(ptr.data == value) 
		{
			//Insert Node after Value and exit loop.
			Node temp = ptr.next;
			ptr.next = newNode;
			newNode.next = temp;
			break;
		}
		//ptr now points to next node
		else
		ptr = ptr.next;
	}
	// TRAVERSE AGAIN; This is not part of algorithm
	ptr=list.start;
	while(ptr != null)
	{
		System.out.print(ptr.data+" ");
		ptr= ptr.next;
	}	
}
}