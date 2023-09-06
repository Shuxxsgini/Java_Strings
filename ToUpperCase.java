/*
 * toUpperCase():  
 */
import java.util.*;
public class ToUpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String: ");
		str=sc.nextLine();
		System.out.println("Accepted string: "+str);
		System.out.println("Upper Case is: "+str.toUpperCase());
		sc.close();
	}

}
