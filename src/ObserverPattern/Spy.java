/**
 * 파일명 : Spy.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 변화를 통보받는 사장 끄나풀
public class Spy implements Observer {
	private Employee employee;
	public Spy(Employee employee) {
		this.employee = employee;
	}
	public void update(Observable o, Object arg) {
		if(o instanceof Watcher) {
			System.out.println("고자질쟁이가" + employee.getDesc() + "이 놀고있었다고 고자질");
		}
	}
}
