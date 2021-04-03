public class Main {
	public static void main(String[] args) {
		LinkedArray arr = new LinkedArray<String>();

		arr.add("ola");
		arr.add("abc");
		arr.add("xx");
		arr.add("nn");
		arr.add(2, "ff");
		arr.add("ff");
		System.out.printf("lastIndexOf: %s%n", arr.lastIndexOf("ff"));
		System.out.printf("Removed: %s%n", arr.removeFirst("ff"));
		System.out.printf("Removed: %s%n", arr.remove(0));
		System.out.println(arr.size());
		for (var element : arr.toArray()) {
			System.out.println(element);
		}
	}
}
