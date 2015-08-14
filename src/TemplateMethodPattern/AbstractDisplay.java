/**
 * 파일명 : AbstractDisplay.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 
 */
package TemplateMethodPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 추상 클래스 AbstractDisplay
public abstract class AbstractDisplay {

	// 하위 클래스에 구현을 맡기는 추상 메서드(1) open
	public abstract void open();
	
	// 하위 클래스에 구현을 맡기는 추상 메서드(2) print
	public abstract void print();
	
	// 하위 클래스에 구현을 맡기는 추상 메서드(3) close 
	public abstract void close();
	
	// 추상 클래스에서 구현되고 있는 메서드 display
	public final void display() {
		
		// 우선 open하고
		open();
		
		// print를 5번 반복하고
		for(int i=0; i<5; i++) {
			print();
		}
		
		// 마지막으로 close한다. 이것이 display 메서드에서 구현되고 있는 내용.
		close();
	}
}
