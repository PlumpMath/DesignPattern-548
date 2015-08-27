/**
 * 파일명 : Printable.java
 * 작성일 : 2015. 8. 27.
 * 파일설명 : 
 */
package ProxyPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// Printable 인터페이스는 PrinterProxy 클래스와 Printer 클래스를 동일시 하기 위한 것.
public interface Printable {
	
	// 이름의 설정
	public abstract void setPrinterName(String name);
	// 이름의 취득
	public abstract String getPrinterName();
	// 문자열 표시(프린트 아웃)
	public abstract void print(String string);
}
