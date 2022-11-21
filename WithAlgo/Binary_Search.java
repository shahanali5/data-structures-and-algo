class Binary_Search {
	public static void main(String[] args) {

		int size = 5;
		
		int[] arr = new int[size];
		
		// Values of elements
		arr[0]=10;   arr[1]=20;   arr[2]=30;   arr[3]=40;  arr[4]=50;

		System.out.println("Original Array");
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

		// Binary Search
		int n = 4;
		int item = 40;  // item which we search in array
		int LB=0, UB=n, BEG=LB, END=UB;
		int MID = (BEG+END) / 2;

		while(BEG <= END) {
			if(item < arr[MID]) {
				END = MID-1;
			}
			else {
				BEG = MID+1;
			}
			MID = (BEG+END) / 2;
		}

		if(arr[MID] == item) {
			int LOC = MID;
			System.out.println("\nItem is found at " + LOC);
		}
		else {
			System.out.println("\nItem is not found");
		}	
	}
}