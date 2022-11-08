package assignment_06nov_2022;

public class Increment_Decrement {
	public static void main(String[] args) {
		System.out.println("Increment and Decrement Operation");
		int i = 10;
		int j = 20;
		int k = 30;
		int l = 40;
		int sum = 0;
		Increment_Decrement.Operation1(i, sum);
		Increment_Decrement.Operation2(i, j, sum);
		Increment_Decrement.Operation3(k, l, sum);
		Increment_Decrement.Operation4(i, j, k, sum);
		Increment_Decrement.Operation5(i, l, sum);
		Increment_Decrement Sum1 = new Increment_Decrement();
		Increment_Decrement Sum2 = new Increment_Decrement();
		Sum1.Operation6(i, k, sum);
		Sum1.Operation7(j, k, sum);
		Sum1.Operation8(k, l, sum);
		Sum2.Operation9(i, j, k, l, sum);
		Sum2.Operation10(i, j, k, sum);
	}

	public static void Operation1(int i, int sum) {
		System.out.print("Operation 1 = First Five Even numbers: ");
		for (i = 2; i <= 10; i++) {
			sum = i++;
			System.out.print(" " + sum);
		}
		System.out.println();
	}

	public static void Operation2(int i, int j, int sum) {
		sum = i++ + j++;
		System.out.println("Operation 2 sum = " + sum);
	}

	public static void Operation3(int k, int l, int sum) {
		sum = ++k + ++l;
		System.out.println("Operation 3 sum = " + sum);
	}

	public static void Operation4(int i, int j, int k, int sum) {
		sum = i-- - j-- - k--;
		System.out.println("Operation 4 sum = " + sum);
	}

	public static void Operation5(int i, int l, int sum) {
		sum = l-- - i--;
		System.out.println("Operation 5 sum = " + sum);
	}

	public void Operation6(int i, int k, int sum) {
		sum = --i + --k;
		System.out.println("Operation 6 sum = " + sum);
	}

	public void Operation7(int j, int k, int sum) {
		sum = --j - k--;
		System.out.println("Operation 7 sum = " + sum);
	}

	public void Operation8(int k, int l, int sum) {
		sum = --l - --k;
		System.out.println("Operation 8 sum = " + sum);
	}

	public void Operation9(int i, int j, int k, int l, int sum) {
		sum = i++ + j++ + k++ + l++;
		System.out.println("Operation 9 sum = " + sum);
	}

	public void Operation10(int i, int j, int k, int sum) {
		sum = i-- + j-- - k++;
		System.out.println("Operation 10 sum = " + sum);

	}
}
