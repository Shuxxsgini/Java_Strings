/*
 * Write a program to Accept a String and count no. of Vowel.
 */
import java.util.*;
public class VowelCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter String: ");
		str=sc.nextLine();
		str=str.toLowerCase();
		int VowelCount=0;
		for(int i=0;i<str.length();i++)
		{
			char v=str.charAt(i);
			if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u' )
			{
				VowelCount++;
			}
			
		}
		
		
		System.out.println("Number of Vowels in this string is: "+VowelCount);
		sc.close();
	}

}
