import java.util.Scanner;
public class PrintNumberInWord {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a Integer between 1&9");
		int i = keyboard.nextInt();
		switch(i){
		case 1:
			System.out.println("The input Integer is one");
			break;
		case 2:
			System.out.println("The input Integer is two");
			break;
		case 3:
			System.out.println("The input Integer is three");
			break;
		case 4:
			System.out.println("The input Integer is four");
			break;
		case 5:
			System.out.println("The input Integer is five");
			break;
		case 6:
			System.out.println("The input Integer is six");
			break;
		case 7:
			System.out.println("The input Integer is seven");
			break;
		case 8:
			System.out.println("The input Integer is eight");
			break;
		case 9:
			System.out.println("The input Integer is nine");
			break;
		default:
			System.out.println("The input Integer is other ");
			break;
		}
		keyboard.close();
	}
}
