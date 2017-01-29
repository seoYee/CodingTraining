package helloTest;

import java.util.Scanner;

import vo.UserVo;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		UserVo user = new UserVo();
		user.setName(scan.nextLine());
		
		System.out.println("Hello, "+user.getName()+", nice to meet you!");
	}

}
