public class Main {
	public static void main(String[] args) {
		LinkedArray arr = new LinkedArray<String>();

		arr.add("ola");
		arr.add("abc");
		arr.add("xx");
		arr.add("nn");
		arr.add("ff");
		System.out.printf("Removed: %s%n", arr.remove(2));
		System.out.println(arr.size());
		for (var element : arr.toArray()) {
			System.out.println(element);
		}
	}
}
