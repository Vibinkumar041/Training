
public class methodcallforcalci {
	public static void add(int a, int b) {
		int c = a + b;
		System.out.println("The addition is= " + c);
	}

	public static void sub(int a, int b) {
		int c = a - b;
		System.out.println("The subraction is= " + c);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		add(a, b);
		sub(a, b);
	}
}