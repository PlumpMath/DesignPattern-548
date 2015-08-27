/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 27.
 * 파일설명 : 
 */
package ProxyPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		Printable printer = new PrinterProxy("ProxyPrinter01");
		System.out.println("현재 동작중인 프린터는" + printer.getPrinterName() + "입니다.");
		printer.setPrinterName("ProxyPrinter02");
		System.out.println("현재 동작중인 프린터는" + printer.getPrinterName() + "입니다.");
		
		printer.print("GoodBye");
	}
}
