import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a number: ");
		double userdoublequestion1 = scanner.nextDouble();
		scanner.nextLine();

		double sixpack = Math.abs(userdoublequestion1);

		System.out.println(sixpack);
		
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a number: ");
		double number1q2 = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Input another number: ");
		double number2q2 = scanner.nextDouble();
		scanner.nextLine();

		double quickmathsq2 = number1q2 / number2q2;

		double floorofmaths = Math.floor(quickmathsq2);
		System.out.println(floorofmaths);

		double ceilingofmaths = Math.ceil(quickmathsq2);
		System.out.println(ceilingofmaths);
		
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a number: ");
		double numberofq3 = scanner.nextDouble();
		scanner.nextLine();

		double squarerooty = Math.sqrt(numberofq3);

		System.out.println(Math.round(squarerooty));
		
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a number: ");
		double baseq4 = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Input another number: ");
		double exponentq4 = scanner.nextDouble();
		scanner.nextLine();

		double simplemaths = Math.pow(baseq4, exponentq4);

		System.out.println(simplemaths);
		
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num1q5 = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Input another number: ");
		double num2q5 = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Input one more number: ");
		double num3q5 = scanner.nextDouble();
		scanner.nextLine();

		double maxval = Math.max(num1q5, Math.max(num2q5, num3q5));
		System.out.println(maxval);

		double minval = Math.min(num1q5, Math.min(num2q5, num3q5));
		System.out.println(minval);

	}
	public static void q6() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input a sentence: ");
		String stringq6 = scanner.nextLine();

		boolean checkforon = stringq6.contains("on");

		System.out.println(checkforon);
		
	}
	public static void q7() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input the word mango: ");
		String stringq7 = scanner.nextLine();

		boolean checkformango = stringq7.equalsIgnoreCase("mango");

		System.out.println(checkformango);
		
	}
	public static void q8() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a word: ");
		String stringq8 = scanner.nextLine();

		System.out.print("Input a letter: ");
		String letterq8 = scanner.nextLine();

		System.out.println(stringq8.indexOf(letterq8));
		System.out.println(stringq8.lastIndexOf(letterq8));
		
	}

	public static void q9() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String stringq9 = scanner.nextLine();

		System.out.println("Your sentence is " + stringq9.length() + " characters long");
		
	}
	public static void q10() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String stringq9 = scanner.nextLine();

		System.out.print("Input a word to replace: ");
		String wordtoreplace = scanner.nextLine();

		System.out.print("What word would you like to replace it with: ");
		String replacementword = scanner.nextLine();

		String answer = stringq9.replace(wordtoreplace, replacementword);

		System.out.println(answer);
		
	}

	public static void q11() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String stringq11 = scanner.nextLine();

		String removeblank = stringq11.trim();

		String upp = removeblank.toUpperCase();
		System.out.println(upp);

		String down = removeblank.toLowerCase();
		System.out.println(down);

	}

	public static void q12() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a word: ");
		String stringq12 = scanner.nextLine();

		System.out.println(stringq12.substring(0, 4));

		System.out.println(stringq12.substring(stringq12.length() - 4));
		
	}
	

}
