package ch15;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); //0번째를 지워라
	}

	@Override
	public int getSize() {
		return getCount();
	}


}
