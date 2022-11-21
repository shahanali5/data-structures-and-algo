class Traversal_Array {
	public static void main(String args[]) {

		int[] lA = new int[5];

		// Values of elements
		lA[0]=10; 
		lA[1]=20;
		lA[2]=30;
		lA[3]=40; 
		lA[4]=50;
		
		// Print/Traverse the Array(lA)
		int n = 4;
		int lb = 0, ub = n;
		for(int a = lb; a <= ub; a++) {
			System.out.print(lA[a] + " ");
		}
	}
}