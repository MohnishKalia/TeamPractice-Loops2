import java.util.Scanner;

public class Age7YearsInFuture {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("How old are you now?");
		int age = input.nextInt();
		age = age + 7;
		System.out.println("In 7 years, you will be " + age + " years old");
		input.close();
	}

}
