/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 동작 테스트 클래스
 */
package ObserverPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// Main 클래스에서는 RandornNumberGenerator의 인스턴스를 한 개 만들고,
// 그 관찰자를 두 개 만든다.
public class Main {
	public static void main(String[] args) {
		
		NumberGenerator generator = new RandomNumberGenerator();
		/*
		observer1은 DigitObserver, observer2는 GraphObserver의 인스턴스 addObserver 메서드를 사용해서 관찰자를 등록한 후 
		generator. execute를 시용해서 수를 생성.
		 */
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		generator.addObserver(observer1);
		generator.addObserver (observer2);
		generator.execute();
	}
}
