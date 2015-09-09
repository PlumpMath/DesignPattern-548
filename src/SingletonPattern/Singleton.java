/**
 * 파일명 : singleton.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 
 */
package SingletonPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
public class Singleton {
	private static Singleton singleton = new Singleton();

	// 외부에서 Singleton 클래스의 생성자 호출을 금지하기 위해 private으로 선언
	// new Singleton() 이라는 식이 클래스 외부에 있다고 하더라도 컴파일 시 에러발생
	// Singleton 패턴은 프로그래머가 실수해도 인스턴스가 1개만 생성되도록 하는 패턴이다.
	// 이것을 보증하기 위해서 생성자를 private로 해둘 필요가 있음.
	
	// private으로 생성자를 만들면 new로 생성 못함
	private Singleton() {
		System.out.println("인스턴스 생성");
	}
	
	/*
	Singleton의 역할
	유일한 인스턴스를 얻기 위한 static 메서드를 갖고 있다.
	이 메서드는 언제나 동일한 인스턴스를 반환한다.
	
	프로그램의 실행 개시 후 최초로 getInstance 메소드를 호출했을 때 Singleton 클래스는 초기화된다.
	그리고 이때 static 필드의 초기화가 이루어지고 유일한 인스턴스가 만들어진다.
	*/
	public static Singleton getInstance() {
		return singleton;
	}
}
