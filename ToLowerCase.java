
import java.util.Scanner;
public class ToLowerCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String: ");
		str=sc.nextLine();
		System.out.println("Accepted string: "+str);
		System.out.println("Lower Case is: "+str.toLowerCase());
		sc.close();
	}

}
