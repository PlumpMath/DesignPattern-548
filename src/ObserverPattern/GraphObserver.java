/**
 * 파일명 : GraphObserver.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 관찰한 수를 '간이 그래프'로 수를 표시하는 클래스.
 */
package ObserverPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class GraphObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.println("GraphObserver: ");
		int count = generator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			// 표시되는 모습을 잘 알 수 있도록 Thread. sleep을 사용해서 속도를 느리게 한다.
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
