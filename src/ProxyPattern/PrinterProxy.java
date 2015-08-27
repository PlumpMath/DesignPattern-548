/**
 * 파일명 : PrinterProxy.java
 * 작성일 : 2015. 8. 27.
 * 파일설명 : 
 */
package ProxyPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 대리인의 역할 수행
public class PrinterProxy implements Printable {

	private String name;
	private Printer real;
	
	public PrinterProxy(){}
	
	public PrinterProxy(String name) {
		this.name = name;
	}
	
	// 이름의 설정
	public synchronized void setPrinterName(String name) {
		if(real != null) {
			// '본인'에게도 설정한다.
			real.setPrinterName(name);
		}
		this.name = name;
	}
	// 이름의 설정
	public String getPrinterName() {
		return name;
	}
	// 표시
	/*
	=== ProxyPrinter02 ===
	GoodBye
	*/
	public void print(String string) {
		realize();
		real.print(string);
	}
	// '본인'을 생성
	private synchronized void realize() {
		if(real == null) {
			real = new Printer(name);
		}
	}
}
