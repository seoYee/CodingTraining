package helloTest;

import java.util.Scanner;

import vo.UserVo;

public class Test {
	public static void main(String[] args) {
		//입력부분
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		
		//문자열 연결부분
		UserVo user = new UserVo();
		user.setName(scan.nextLine());
		String msg = "Hello, "+user.getName()+", nice to meet you!";
		
		//출력부분
		System.out.println(msg);
	}

}
