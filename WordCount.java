/*
 * Write a program to Accept a String and count no. of words.
 */
import java.util.*;
public class WordCount {
	
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String str;
			System.out.print("Enter String: ");
			str=sc.nextLine();
			int Word=0;
			for(int i=0;i<str.length();i++)
			{		
				if(Word==str.charAt(i))
				{
				Word++;
				System.out.println("Number of Words in this string is: "+Word);
				sc.close();
				}
				
				
			}
			
			
			
		}

	}
