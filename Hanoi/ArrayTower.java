/*
Due to type erasure the following will not work:

public <T> void genericMethod() {
    T t = new T(); // Can not instantiate the type T.
}
*/
import java.util.ArrayList;

public class ArrayTower {
	private ArrayList<ArrayStack> rods;
	private int stackSize;

	public ArrayTower(int n_rods, int stackSize) throws Exception {
		this.rods      = new ArrayList<ArrayStack>(n_rods);
		this.stackSize = stackSize;

		for (int i=0; i<n_rods; i++)
			rods.add(new ArrayStack<Disc>(stackSize));
		for (int i=stackSize; i>0; i--)
			rods.get(0).push(new Disc(i));
	}

	public boolean move(int src, int dest) throws Exception {
		if (gameFinished())
			return false;
		Disc src_top = (Disc) rods.get(src).top();
		Disc dest_top = (Disc) rods.get(dest).top();
		if (src_top == null)
			return false;
		if (src_top.smallerThan(dest_top)) {
			src_top = (Disc) rods.get(src).pop();
			rods.get(dest).push(src_top);
			return true;
		}
		return false;
	}

	public boolean gameFinished() {
		for (int i=0; i<rods.size()-1; i++)
			if (!rods.get(i).isEmpty())
				return false;
		return true;
	}

	public int getSize() {
		return rods.size();
	}

	@Override
	public String toString() {
		ArrayList<String> result = new ArrayList<String>();
		int cur_size;
		Disc curr;
		for (int i=0; i<rods.size(); i++) {
			cur_size = rods.get(i).getSize();
			for (int j=0; j<cur_size; j++) {
				try {
					curr = (Disc) rods.get(i).get(j);
					result.add(String.format("%s%s", " ".repeat(cur_size-j), "==".repeat(curr.getSize())));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			result.add(String.format("%s\n", "--".repeat(8)));
		}
		return String.join("\n", result);
	}
}
