class Bubble_Sort {
	public static void main(String[] args) {

		int size = 5;
		
		int[] arr = new int[size];
		
		// Values of elements
		arr[0]=30;   arr[1]=50;   arr[2]=40;   arr[3]=20;  arr[4]=10;

		System.out.println("Original Array");
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

		// Bubble sort
		int n = 4;
		for(int k=0; k <= n-1; k++) {
			for(int ptr=0; ptr<n-k; ptr++) {
				if(arr[ptr] > arr[ptr+1]) {
					int temp = arr[ptr];
					arr[ptr] = arr[ptr+1];
					arr[ptr+1] = temp;
				}
			}
		}

		System.out.println("\nArray after sorting");
		for(int b=0; b<arr.length; b++) {
			System.out.print(arr[b] + " ");
		}
	}
}