/**
 * 파일명 : StringDisplay.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 
 */
package TemplateMethodPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// AbstractDisplay의 하위 클래스
public class StringDisplay extends AbstractDisplay {
	
	// 표시해야 할 문자열.
	private String string;
	
	// 바이트 단위로 계산한 문자열의 '길이'
	private int width;
	
	public StringDisplay(String string) {
		// 생성자에서 전달된 문자열 string을 필드에 기억
		this.string = string;
		// 바이트 단위의 길이도 필드에 기억해 두고 나중에 사용
		this.width = string.getBytes().length;
	}
	
	// 오버라이딩해서 정의한 open 메서드
	public void open() {
		// 이 클래스의 메서드 printLine에서 선을 그림.
		printLine();
	}
	
	public void print() {
		// 필드에 기억해 둔 문자열의 전후에 "|"을 붙여서 표시.
		System.out.println("|" + string + "|");
	}
	
	public void close() {
		// 이 클래스의 메서드 printLine에서 선을 그림.
		printLine();
		
	}

	// open과 close에서 호출된 printLine 메서드
	// private이기 때문에 이 클래스 안에서만 사용된다.
	private void printLine() {
		
		// 테두리의 모서리를 표현하는 "+" 마크를 표시.
		System.out.print("+");
	
		// width개의 "-"을 표시하고 테두리 선으로 이용.
		for(int i = 0; i < width; i++) {
			System.out.print("-");
		}
		
		// 테두리의 모서리를 표현하는 "+" 마크 표시
		System.out.println("+");
	}
}
