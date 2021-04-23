import java.util.Scanner;

public class Count_whitespaces_andWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int space = 0, letter = 0;

		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(ch[i]))
				letter++;
			else if (Character.isSpace(ch[i]))
				space++;
		}
		System.out.println("White Spaces are: " + space);
		System.out.println("Words are: " + letter);
	}

}
