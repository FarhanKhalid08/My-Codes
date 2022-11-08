package assignment_06nov_2022;

public class Boolean {

	public static void main(String[] args) {
		System.out.println("Primitive Data Type: Boolean");
		int a = 20;
		int b = 40;
		int c = 10;
		Boolean.Logic1(a, b);
		Boolean.Logic2(a, b);
		Boolean.Logic3(b, c);
		Boolean.Logic4(b, c);
		Boolean.Logic5(a, c);
		Boolean boolean1 = new Boolean();
		Boolean boolean2 = new Boolean();
		boolean1.Logic6(b, c);
		boolean1.Logic7(b, a);
		boolean1.Logic8(a, b);
		boolean2.Logic9(a, c);
		boolean2.Logic10(b, c);
	}

	public static void Logic1(int a, int b) {
		if (a <= b) {
			System.out.println("Logic 1 is: True");
		} else {
			System.out.println("Logic 1 is: wrong");
		}
	}

	public static void Logic2(int a, int b) {
		if (a >= b) {
			System.out.println("Logic 2 is: True");
		} else {
			System.out.println("Logic 2 is: False");
		}
	}

	public static void Logic3(int b, int c) {
		if (c <= b) {
			System.out.println("Logic 3 is: True");
		} else {
			System.out.println("Logic 3 is: False");
		}
	}

	public static void Logic4(int b, int c) {
		if (c == b) {
			System.out.println("Logic 4 is: True");
		} else {
			System.out.println("Logic 4 is: False");
		}
	}

	public static void Logic5(int a, int c) {
		if (a <= c) {
			System.out.println("Logic 5 is: True");
		} else {
			System.out.println("Logic 5 is: False");
		}

	}

	public void Logic6(int b, int c) {
		if (c >= b) {
			System.out.println("Logic 6 is: True");
		} else {
			System.out.println("Logic 6 is: False");
		}
	}

	public void Logic7(int b, int a) {
		if (a == b) {
			System.out.println("Logic 7 is: True");
		} else {
			System.out.println("Logic 7 is: False");
		}
	}

	public void Logic8(int a, int b) {
		if (b >= a) {
			System.out.println("Logic 8 is: True");
		} else {
			System.out.println("Logic 8 is: False");
		}
	}

	public void Logic9(int a, int c) {
		if (c >= a) {
			System.out.println("Logic 9 is: True");
		} else {
			System.out.println("Logic 9 is: False");
		}
	}

	public void Logic10(int b, int c) {
		if (b != c) {
			System.out.println("Logic 10 is: True");
		} else {
			System.out.println("Logic 10 is: False");
		}
	}
}
