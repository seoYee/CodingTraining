//연습문제 2 글자수 세기

//출력 예
//What is the input string? Homer
//Homer has 5 characters.

//제약조건
//1. 출력 결과에는 입력 받은 문자열이 그대로 나타나도록 할 것
//2. 출력을 위해 하나의 출력문을 사용할 것
//3. 문자열의 길이를 구하기 위해 프로그래밍 언어에서 제공하는 내장 함수를 사용할 것

//도전과제
//1. 사용자가 아무것도 입력하지 않은 채로 엔터 키를 치면 무엇이라도 입력하라는 메시지를 나타내보자.
//2. 이 프로그램을 GUI버전으로 작성하여 글자를 입력할 때마다 글자 수가 바로 바로 업데이트되도록 하라.
//	GUI 라이브러리가 없다면 HTML과 JavaScript사용가능.
package vo;

import java.util.Scanner;

public class StringVo {
	private String string;

	public void setString(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

}
