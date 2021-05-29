/*
Due to type erasure the following will not work:

public <T> void genericMethod() {
    T t = new T(); // Can not instantiate the type T.
}
*/
import java.util.ArrayList;

public class LinkedTower {
	private ArrayList<LinkedStack> rods;
	private int stackSize;

	public LinkedTower(int n_rods, int stackSize) throws Exception {
		this.rods      = new ArrayList<LinkedStack>(n_rods);
		this.stackSize = stackSize;

		for (int i=0; i<n_rods; i++) {
			rods.add(new LinkedStack<Disc>());
		}
		for (int i=0; i<stackSize; i++) {
			rods.get(0).push(new Disc(i + 1));
		}
	}

	public boolean move(int src, int dest) throws Exception {
		if (gameFinished())
			return false;
		Disc src_top = (Disc) rods.get(src).top();
		Disc dest_top = (Disc) rods.get(dest).top();
		System.out.println(src_top.smallerThan(dest_top));
		if (src_top.smallerThan(dest_top)) {
			System.out.println("cur_size");
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

	@Override
	public String toString() {
		ArrayList<String> result = new ArrayList<String>();
		int cur_size;
		for (int i=0; i<rods.size(); i++) {
			cur_size = rods.get(i).getSize();
			System.out.println(cur_size);
			for (int j=0; j<cur_size; j++) 
				result.add(String.format("%s%s", " ".repeat(cur_size-j), "==".repeat(j+1)));
		}
//		return String.format("\033[%d;%dH", stackSize-1, (stackSize+1));
		return String.join("\n", result);
	}
}
