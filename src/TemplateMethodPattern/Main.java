/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 
 * Template Method 패턴이란?
 * 상위 클래스에서 처리의 뼈대를 결정하고， 하위 클래스에서 그 구체적인 내용을 결정하는 디자인 패턴
 * ( Template Method 패턴은 상위 클래스에 해당 )
 */
package TemplateMethodPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {

		// 'A'를 가진 CharDistplay 인스턴스를 1개 만든다.
		AbstractDisplay abstractDisplay01 = new CharDisplay('A');
		// "Hello, EveryOne"를 가진 StringDistplay 인스턴스를 1개 만든다.
		AbstractDisplay abstractDisplay02 = new StringDisplay("Hello. EveryOne");
		// "We are the 'CDG'"를 가진 StringDistplay 인스턴스를 1개 만든다.
		AbstractDisplay abstractDisplay03 = new StringDisplay("We are the 'CDG'");
		
		/*
		abstractDisplay01,02,03 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이기 때문에
		상속한 display 메서드를 호출할 수 있다.
		실제 동작은 CharDisplay나 StringDisplay에서 결정한다.
		 */
		abstractDisplay01.display();
		abstractDisplay02.display();
		abstractDisplay03.display();
	}

}
