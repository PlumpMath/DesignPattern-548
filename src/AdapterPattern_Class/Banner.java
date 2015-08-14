/**
 * 파일명 : Banner.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 
 */
package AdapterPattern_Class;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Banner {

	private String string;
	public Banner(String string) {
		this.string = string;
	}
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
