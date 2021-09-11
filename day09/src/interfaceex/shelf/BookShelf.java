package interfaceex.shelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {	// �� �� - 0�� �ε����� ����
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
}
