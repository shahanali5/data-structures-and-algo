class Deletion_Array {
	public static void main(String args[]) {

		int[] lA = new int[5];

		// Values of elements
		lA[0]=10;   lA[1]=20;   lA[2]=30;   lA[3]=40;  lA[4]=50;
		

		// Deleting value at specific index(k) 
		int n = 4, k = 3;   // K is the element index which we delete
		int item = lA[k];  // here we store the deleted item
		for(int j = k; j <= n-1; j = j + 1) {
			lA[j] = lA[j+1];
		}
		n = n-1;

		// Print/Traverse the Array(lA)
		int lb = 0, ub = n;
		for(int a = lb; a <= ub; a++) {
			System.out.print(lA[a] + " ");
		}
	}
}