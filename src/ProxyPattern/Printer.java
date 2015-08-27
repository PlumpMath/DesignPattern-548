/**
 * 파일명 : Printer.java
 * 작성일 : 2015. 8. 27.
 * 파일설명 : 
 */
package ProxyPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Printer implements Printable{
	private String name;
	public Printer() {
		heavyJob("Printer의 인스턴스 생성 중");
	}
	// 생성자
	public Printer(String name) {
		this.name = name;
		heavyJob("Printer의 인스턴스 (" + name + ") 생성 중 ");
	}

	// 이름의 설정
	public void setPrinterName(String name) {
		this.name = name;
	}
	
	// 이름의 취득
	public String getPrinterName() {
		return name;
	}
	
	// 이름을 붙여서 표시
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}
	
	// 무거운 일
	public void heavyJob(String msg) {
		System.out.print(msg);
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			System.out.print(".");
		}
		System.out.println("");
		System.out.println("완료");
	}
}
