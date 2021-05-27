/*
Due to type erasure the following will not work:

public <T> void genericMethod() {
    T t = new T(); // Can not instantiate the type T.
}
*/
import java.util.ArrayList;

public class LinkedTower {
	private ArrayList<ArrayStack> rods;
	private int stackSize;

	public LinkedTower(int n_rods, int stackSize) throws Exception {
		this.rods      = new ArrayList<ArrayStack>(n_rods);
		this.stackSize = stackSize;

		for (int i=0; i<n_rods; i++) {
			rods.add(new ArrayStack<Disc>(stackSize));
		}
		for (int i=0; i<stackSize; i++) {
			rods.get(0).push(new Disc(i + 1));
		}
	}

	public boolean move(int rod) {
		return true;
	}
}
