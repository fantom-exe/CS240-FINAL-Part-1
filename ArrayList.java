/**
 * A class implementing a Priority Queue using single linked chain
 */
public class ArrayList<T> implements ListInterface<T> {
	// member variables
	private T[] list;
	private int currentSize;
	
	// defaults
	ArrayList() {
		list = (T[])new Object[10];
		currentSize = 0;
	}
	
	// add to end of list
	public void add(T newEntry) {
		list[currentSize + 1] = newEntry;
		currentSize++;
	}
	
	// add to position
	public void add(int newPosition, T newEntry) throws IndexOutOfBoundsException {
		// check if newPosition within bounds
		if (newPosition < 1 || newPosition > getLength() + 1)
			throw new IndexOutOfBoundsException();
		
		// store current item at position
		T temp = list[newPosition];
		
		for(int i = 0; i < currentSize; i++) {
			list[newPosition+1] = temp;
		}
		currentSize++;
	}
	
	// remove from position
	public T remove(int givenPosition) {
		
		
		return null;
	}
	
	// empty list
	public void clear() {
	
	}
	
	//
	public T replace(int givenPosition, T newEntry) {
		return null;
	}
	
	// return item at position
	public T getEntry(int givenPosition) {
		return list[givenPosition];
	}
	
	// search for item
	public boolean contains(T anEntry) {
		
		return false;
	}
	
	// return current size
	public int getLength() {
		return currentSize;
	}
	
	//
	public boolean isEmpty() {
		return false;
	}
}
