package assignment_06nov_2022;

public class Concatenation {
	public static void main(String[] args) {
		System.out.println("Concatenation of Words/statements");
		Concatenation.Statment1();
		Concatenation.Statement2();
		Concatenation.Statement3();
		Concatenation.Statement4();
		Concatenation.Statement5();
		Concatenation concate1 = new Concatenation();
		Concatenation concate2 = new Concatenation();
		concate1.Statment6();
		concate1.Statment7();
		concate1.Statement8();
		concate2.Statement9();
		concate2.Statement10();
	}

	public static void Statment1() {
		System.out.println("Hello " + "World,");
	}

	public static void Statement2() {
		System.out.println("I am " + "Farhan Khalid.");
	}

	public static void Statement3() {
		System.out.println("I am " + "Self Employed.");
	}

	public static void Statement4() {
		System.out.println("I live " + "in Springfield.");
	}

	public static void Statement5() {
		System.out.println("Virginia, " + "United States of America.");
	}

	public void Statment6() {
		System.out.println("I study in " + "PeopleNTech.");
	}

	public void Statment7() {
		System.out.println("I am learning " + "Software Testing with Selenium.");
	}

	public void Statement8() {
		System.out.println("We are learning " + "Automation and Java now a days.");
	}

	public void Statement9() {
		System.out.println("Our teacher name " + "is Kumar.");
	}

	public void Statement10() {
		System.out.println("Bye " + "Bye Everyone.");
	}
}
