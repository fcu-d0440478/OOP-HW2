import java.util.Scanner;
public class KeyboardScanner {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int numberOfPods = keyboard.nextInt();
		System.out.println("Enter a float point number:");
		double d1 = keyboard.nextDouble();
		System.out.println("Enter your name:");
		keyboard.nextLine();
		String line = keyboard.nextLine();
		System.out.printf("Hi %s, the multiplication of %d and %f is %.2e",line,numberOfPods,d1,numberOfPods*d1);
	}
}
