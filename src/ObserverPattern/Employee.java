/**
 * 파일명 : Employee.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 변화를 통보받는 직원
public class Employee implements Observer {
	private String desc;
	public Employee(String desc) {
		this.desc = desc;
	}
	public void update(Observable o, Object arg) {
		if(o instanceof Watcher) {
			System.out.println(desc + "이 일하는척");
		}
	}
	public String getDesc() {
		return desc;
	}
}	
