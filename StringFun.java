/**
*String.toUpperCase(); converts all characters in a String to UPPERCASE CHARACTERS
*String.toLowerCase(); converts all characters in a String to lowercase characters
*/
import java.util.Scanner;

public class StringFun
{
	private static int count = 1;

	private static String s = "";
	private static String otherString = "";
	private static String subString = "";

	public static void main(String[] args)
	{
		s = getInput();
		otherString = getInput();
		subString = getInput();		

		manipulateStrings();
	}

	private static String getInput()
	{
		Scanner in = new Scanner(System.in);
		String countedString = "";

		if (count == 1)
			countedString = "s";
		else if (count == 2)
			countedString = "otherString";
		else if (count == 3)
			countedString = "substring";

		System.out.println("What should String " + countedString + " be defined as?: ");
		if (count == 4)
			count = 1;
		else
			count +=1;

		return in.nextLine();
	}

	private static void manipulateStrings()
	{
		System.out.println(s.length());
		System.out.println(s.equals(otherString));
		System.out.println(s.substring(0,2));
		System.out.println(s.trim());
		System.out.println(s.indexOf(subString));
		System.out.println(s.lastIndexOf(subString));
		System.out.println(s.charAt(0));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}
	
}