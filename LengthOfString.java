/*
 * length(): It is used to find the length of String
 */
import java.util.*;
public class LengthOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String: ");
		str=sc.nextLine();
		System.out.println("Accepted string: "+str);
		System.out.println("Length of String: "+str.length());
		sc.close();
	}

}
