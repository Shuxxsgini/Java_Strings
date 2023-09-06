/*
 * Print the pattern:
Enter String: rose
r 
r o 
r o s 
r o s e 
*/
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String: ");
		str=sc.nextLine();
		for(int r=0;r<str.length()+1;r++)
		{
			for(int c=0;c<r;c++)
			{
				System.out.print(str.charAt(c)+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
