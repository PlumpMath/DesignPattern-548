/**
 * 파일명 : PrintBanner.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 
 * 어댑터 역할
 * 
 * Banner 클래스를 확장(extends)해서 showWithParen 메서드와 showWithAster 메서드를 상속.
 * 또한, 필요한 Print 인터페이스를 구현(implements)해서 printWeak 메서드와 printStrong 메서드를 구현. 
 */
package AdapterPattern_Class;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class PrintBanner extends Banner implements Print {
	public PrintBanner(String string) {
		super(string);
	}

	public void printWeak() {
		showWithParen();
	}
	
	public void printStorng() {
		showWithAster();
	}
}
