//연습문제1 : 인사하기
//출력 예 
//What is your name? Brian
//Hello, Brian, nice to meet you!

//제약조건
//입력부분, 문자열 연결(String concatenation) 부분, 출력 부분을 별도로 작성할 것.

//도전과제
//변수를 사용하지 않는 새로운 버전만들기
//사람들마다 서로다른 인사말이 나타나도록 프로그램 작성

package vo;

public class UserVo {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
