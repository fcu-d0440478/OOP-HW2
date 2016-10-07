import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a Integer:");
		int i = keyboard.nextInt();
		if(i%2==0){
			System.out.println("The input Integer is Ever number");
		}else{
			System.out.println("The input Integer is Odd number");
		}
		
	}
}
