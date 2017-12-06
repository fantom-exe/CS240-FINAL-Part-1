public class ShellSort {
	/**
		Using Hibbard Sequence -> 1, 3, 7, ..., (2 * previous + 1)
	*/
	public void iterative(int[] array) {
		
		// find sequence #
		int seqNum = 1;
		
		while (seqNum <= array.length/2)
			seqNum = (seqNum * 2) + 1;
		
		// insertion sort
		int swap; // temporary variable used for swapping
		int swapIndex; // index of swap
		
		while(seqNum > 0) {
			// compare num at index with num at sequence # (h+index)
			for(int i = 0; i + seqNum < array.length; i++) {
				swapIndex = i;
				
				if(array[i] > array[i + seqNum]) { // compare and swap
					swap = array[i];
					array[i] = array[i + seqNum];
					array[i + seqNum] = swap;
				}
				
				printArray(array);
				System.out.println("Swap index: " + swapIndex);
			}
			
			// adjust new sequence #
			seqNum = (seqNum - 1) / 2;
			
			// select next unsorted num in array and (re)set currentNumIndex
			for(int i = 0; (i < array.length) && (seqNum == 1); i++) {
				swap = array[i];
				swapIndex = i;
				
				// backtrack through sorted subset of array
				for(int j = i-1; j >= 0; j--) {
					// swap
					if(swap < array[j]) {
						array[swapIndex] = array[j];
						array[j] = swap;
						
						// update swapIndex
						swapIndex = j;
					}
					
				}
			}
		}
		
	}
	
	public void recursive(IntegerArray array) {
	
	}
	
	// print contents of array
	protected void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		
		System.out.println();
	}
}

