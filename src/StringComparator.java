import java.util.Scanner;
public class StringComparator {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		do{
			System.out.println("Enter a String1:");
			String s1=keyboard.next();
			System.out.println("Enter a String2:");
			String s2=keyboard.next();
			if( s1.equalsIgnoreCase(s2) ){
				System.out.println("The two string are the same");
				break;
			}else{
				System.out.println("The two string are different");
			}
		}while(true);
		keyboard.close();
	}
}
