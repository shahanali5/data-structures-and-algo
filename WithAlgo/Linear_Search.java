class Linear_Search {
	public static void main(String[] args) {

		int size = 5;
		
		int[] arr = new int[size];
		
		// Values of elements
		arr[0]=70;   arr[1]=20;   arr[2]=90;   arr[3]=10;  arr[4]=50;

		System.out.println("Original Array");
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

		// Linear Search
		int n = 4;
		int item = 10;   // item which we search in array
		int LOC=0;
		while( LOC <= n) {
			if(arr[LOC] == item) {
				System.out.println("\nItem found at " + LOC);
				return;
			}
			else {
				LOC  = LOC+1;
			}
			
		}	
		System.out.println("\nItem is not found in Array");
	}
}