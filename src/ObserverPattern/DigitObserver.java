/**
 * 파일명 : DigitObserver.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 숫자로 수를 표시하는 클래스.
 */
package ObserverPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// update 메소드 안에서 인수로 주어진
// NumberGenerator의 getNumber 메소드를 사용해서 수를 취득하고 그것을 표시.
public class DigitObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber());
		try {
			// 표시되는 모습을 잘 알 수 있도록 Thread. sleep을 사용해서 속도를 느리게 한다.
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
