package static_overiding;

public class ApplicationRunner {

	public static void main(String[] args) {
		/*
		 * Parent parent = new Parent(); parent.staticMethod(); Child child = new
		 * Child(); child.staticMethod(); Parent parent1 = new Child();
		 * parent1.staticMethod();
		 * 
		 * String[] temp = { "a", "b", "c" };
		 */
		ApplicationRunner.div(4, 0);
	}

	public static int div(int a, int b) {
		int c = -1;
		try {
			c = a / b;
		} catch (Exception e) {
			System.err.println("Exception");
		} finally {
			System.err.println("Finally");
		}

		return c;

	}
}
