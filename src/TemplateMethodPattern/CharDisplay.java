/**
 * 파일명 : CharDisplay.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 
 */
package TemplateMethodPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// CharDisplay는 AbstractDistplay의 하위 클래스
public class CharDisplay extends AbstractDisplay {

	// 표시해야 할 문자
	private char ch;
	
	// 생성자에서 전달된 문자 ch를 필드에 기억해 둔다.
	public CharDisplay(char ch) {
		this.ch = ch;
	}
	
	// 상위 클래스에서는 추상 메소드
	// 여기에서는 오바라이딩해서 구현
	public void open() {
		// 개시 문자열 "<<"을 표시한다
		System.out.print("<<");
	}
	
	// print 메서드도 여기에서 구현
	// 이것이 display에서 반복해서 호출됨
	public void print() {
		// 필드에 기억해 둔 문자를 1개 표시
		System.out.print(ch);
	}
	
	// close 메서드도 여기서 구현
	public void close() {
		// 종료 문자열 ">>"을 표시.
		System.out.println(">>");
	}
}
