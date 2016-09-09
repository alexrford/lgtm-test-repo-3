import java.util.Collection;
import java.util.LinkedHashSet;

class Main {

	public String foo;
	public String bar;
	private String baz;

	public static void main(String[] args) {
		System.out.println("Hello World" + new Main().baz);
		System.out.println("Hello World" + new Main().baz);
		System.out.println("Hello World" + new Main().baz);

		Collection<Integer> c = new LinkedHashSet<>();
		System.out.println(c.contains("foo"));

	}

}
