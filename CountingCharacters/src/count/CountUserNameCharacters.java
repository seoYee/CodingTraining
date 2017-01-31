package count;

import java.util.Scanner;

import vo.StringVo;

public class CountUserNameCharacters {

	public static void main(String[] args) {
		StringVo string = new StringVo();
		System.out.println("What is the input string?");
		Scanner scan = new Scanner(System.in);
		string.setString(scan.nextLine());
		String msg = string.getString() + " has " + string.getString().length()+ " characters.";
		System.out.println(msg);
	}
}
