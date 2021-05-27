public class Disc {
	private int size;

	public Disc(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean smallerThan(Object obj) {
		if (obj == null || obj == this)
			return false;
		return ((Disc) obj).getSize() > this.getSize();
	}
}
