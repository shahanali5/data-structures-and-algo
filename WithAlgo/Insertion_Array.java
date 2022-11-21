class Insertion_Array {
	public static void main(String args[]) {

		int[] lA = new int[5]; 

		// Values of elements
		lA[0]=10;   lA[1]=20;   lA[2]=30;   lA[3]=40;

		// Inserting value at specific index(k) 
		int n = 3, k = 2;
		int item = 74;  // the element which is inserting
		for(int j = n; j >= k; j = j - 1) {
			lA[j+1] = lA[j];
		}
		lA[k] = item;
		n = n+1;

		// Print/Traverse the Array(lA)
		int lb = 0, ub = 4;
		for(int a = lb; a <= ub; a++) {
			System.out.print(lA[a] + " ");
		}
	}
}