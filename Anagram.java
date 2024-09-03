import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	static boolean areAnagram(String str1, String str2)
	{
		int arr1[] = new int[str1.length()];
		int arr2[] = new int[str2.length()];
		for(int i = 0;i<str1.length();i++) {
			arr1[i]+=str1.charAt(i);
		}
		for(int i = 0;i<str2.length();i++) {
			arr2[i]+=str2.charAt(i);
		}
		int n1 = str1.length();
		int n2 = str2.length();
		if (n1 != n2)
			return false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < n1; i++)
			if (arr1[i] != arr2[i])
				return false;

		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		if (areAnagram(str1, str2))
			System.out.println("The two strings are"
							+ " anagram of each other");
		else
			System.out.println("The two strings are not"
							+ " anagram of each other");
	}
}
