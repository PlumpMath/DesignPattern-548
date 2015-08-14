/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 4.
 * 파일설명 : 퍼사드 패턴

	정의 :
	Facade 패턴은 복잡하게 얽혀 있는 것을 정리해서 높은 레벨의 인터페이스를 제공하는 패턴
	
	설명 :
	Facade 객체는 실생활에서의 고객 서비스 센터와 유사하다. 
	가령, 어떤 상품을 구매하는 과정에서 문제가 생겼다고 가정할 때, 
	고객이 문제의 성격에 따라 해당 부서에 직접 연락하는 것이 아니라 
	고객 서비스 센터를 통하는 것은 Facade 패턴에 대한 좋은 유추 사례가 될 수 있다.
	
	패턴 사용 및 적용 시기 :
	- 복잡한 서브 시스템에 대해 간단한 인터페이스를 제공하기를 원하는 경우
	- 클라이언트와 인터페이스의 구현 클래스 사이에 의존도가 높은 경우
	- 서브 시스템을 레이어(layer)로 구분하고자 하는 경우
 
 */
package FacadePattern;


/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		PageMaker.makeWelcomePage("lim_designer@naver.com", "welcome.html");
	}

}
