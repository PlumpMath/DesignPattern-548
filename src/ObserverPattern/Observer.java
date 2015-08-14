/**
 * 파일명 : Observer.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 관찰자를 나타내는 인터페이스
 * 
 * Observer패턴에서는 관찰 대상의 상태가 변화하면 관찰자에게 알려준다.
 * Observer 패턴은 상태 변화에 따른 처리를 기술할 때 효과적이다. 
 */
package ObserverPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public interface Observer {
	// update 메소드는 수를 생성하는 NumberGenerator 클래스에서 호출
	public abstract void update(NumberGenerator generator);

}
