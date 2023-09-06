/*
Print the pattern:
Enter String: ROSE   
R O S E 
R O S 
R O 
R
 */
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String: ");
		str=sc.nextLine();
		int len=str.length();
		len--;
		for (int r=len+1;r>0;r--)
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
