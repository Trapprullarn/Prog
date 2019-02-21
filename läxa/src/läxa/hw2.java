package läxa;

import java.util.Scanner;

public class hw2
{
	public static void main(String[] args)
	{
		System.out.println("Enter string to reverse:");
		
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String reverse = reverse(str);
		
		
		
		
		System.out.println("Reversed string is:");
		System.out.println(reverse);

	}
	public static String reverse(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
}