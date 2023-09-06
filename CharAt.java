/*
 * CharAt(): It is used to find out string to the index number.
 * 
 * eg: 0 1 2 3 4 5 6 7 8 9 0
 *     S H U B H A N G I N I
 */
import java.util.Scanner;
public class CharAt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String: ");
		str=sc.nextLine();
		
		System.out.println("Accepted string: "+str);
		System.out.println("Character at that position is: "+str.charAt(8));
        
		sc.close();
	}

}

