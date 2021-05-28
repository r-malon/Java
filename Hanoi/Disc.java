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

	public boolean smallerThan(Disc obj) {
		if (obj == this)
			return false;
		if (obj == null)
			return true;
		return obj.getSize() > this.getSize();
	}
}
