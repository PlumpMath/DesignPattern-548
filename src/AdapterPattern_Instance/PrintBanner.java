/**
 * 파일명 : PrintBanner.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 
 * 어댑터 역할
 * 
 * Banner 클래스를 확장(extends)해서 showWithParen 메서드와 showWithAster 메서드를 상속.
 * 또한, 필요한 Print 인터페이스를 구현(implements)해서 printWeak 메서드와 printStrong 메서드를 구현. 
 */
package AdapterPattern_Instance;

/**
 * @author 임승한(lim_designer@naver.com)
 */


/*
PrintBanner 클래스는 banner 필드에서 Banner 클래스의 인스턴스를 가진다.
이 인스턴스는 PrintBanner 클래스의 생성자에서 생성합니다. 
그리고 printWeak 및 printStrong 메소드에서는 banner 펼드를 매개로 showWithParen, showWithAster 메서드를호출.
이전 예에서는 자신의 상위 클래스에서 상속한 showWithParen. showWithAster 메서드를 호출하고 있었지만， 
이번에는 펼드를 경유해서 호출하고 있다. 즉 위임을 하고 있다.
PrintBanner 클래스의 printWeak 메소드가 호출되었을 때， 자신이 처리하는 것이 아니라
별도의 인스턴스(Banner의 인스턴스)인 showWithParen 메소드에게 위임.

About '위임'
- ‘누군가에게 밑긴다’ 라는 의미.
- Java에서 위임은 어떤 메서드의 실제 처리를 다른 인스턴스의 메서드에 맡기는 것을 뜻함.
*/
public class PrintBanner extends Print {
	// Banner를 위임
	private Banner banner;
	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	public void printWeak() {
		banner.showWithParen();
	}
	
	public void printStorng() {
		banner.showWithAster();
	}
}