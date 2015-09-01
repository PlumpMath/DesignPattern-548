/**
 * 파일명 : Main.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package ObserverPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		Watcher watcher = new Watcher();
		Employee pc01 = new Employee("만화책보는 놈");
		Employee pc02 = new Employee("퍼질러 자는 놈");
		Employee pc03 = new Employee("포카치는 놈");
		
		// spy는 pc03을 보고있음
		// 요놈은 꼰질르기의 대가
		Spy spy = new Spy(pc03);
		
		watcher.addObserver(pc01);
		watcher.addObserver(pc02);
		watcher.addObserver(pc03);
		watcher.addObserver(spy);
		
		watcher.action("사장 뜸");
		watcher.deleteObserver(pc03);
		watcher.deleteObserver(spy);
		
		watcher.action("사장 뜸");
	}
}
