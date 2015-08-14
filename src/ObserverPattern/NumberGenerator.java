/**
 * 파일명 : NumberGenerator.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 수를 생성하는 오브젝트를 나타내는 클래스.
 */
package ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author 임승한(lim_designer@naver.com)
 */
public abstract class NumberGenerator {
	
	private ArrayList observers = new ArrayList();	// Observer를 저장
	
	public void addObserver(Observer observer) {	// Observer를 추가
		observers.add(observer);
	}
	public void deleteObserver(Observer observer) {	// Observer를 삭제
		observers.remove(observer);
	}
	
	// notifyObservers 메서드는 update 메서드를 호출해
	// ‘나의 내용이 갱신되었습니다. 표시 쪽도 갱신해 주십시오’라고 Observer 전원에게 전한다. 
	public void notifyObservers() {		// Observer에 알림
		Iterator it = observers.iterator();
		while (it.hasNext()) {
			Observer o = (Observer)it.next();
			o.update(this);
		}
	}
	
	// 실제의 수의 생성 (execute 메서드)과 수를 취득하는 부분(getNumber 메서드)은
	// 하위 클래스에서 구현되도록 추상 메소드로 되어 있음.
	public abstract int getNumber();	// 수를 취득한다
	public abstract void execute();		// 수를 생성한다

}
