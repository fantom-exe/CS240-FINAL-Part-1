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
	public T remove(int position) throws IndexOutOfBoundsException {
		// check if newPosition within bounds
		if (position < 1 || position > getLength() + 1)
			throw new IndexOutOfBoundsException();
		
		// is empty
		if(isEmpty())
			throw new EmptyListException();
		
		T removed = list[position];
		list[position] = null;
		currentSize--;
		
		return removed;
	}
	
	// empty list
	public void clear()	{
		for(T e : list)
			e = null;
		
		currentSize = 0;
	}
	
	// replace item at position
	public T replace(int position, T item) throws EmptyListException {
		if(isEmpty())
			throw new EmptyListException();
		
		T replaced = list[position];
		list[position] = item;
		
		return replaced;
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
	
	public boolean isEmpty() {
		return currentSize == 0;
	}
	
}
