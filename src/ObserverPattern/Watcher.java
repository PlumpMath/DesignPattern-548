/**
 * 파일명 : Watcher.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package ObserverPattern;

import java.util.Observable;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 변화를 통보하는 Observable
public class Watcher extends Observable {
	public void action(String string) {
		System.out.println("======" + string + "======");
		setChanged();
		notifyObservers(string);
	}
	
}
