/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 
 * singleton이란 ‘요소를 1개밖에 가지고 있지 않은 집합’
 * 
 * 지정한 클래스의 인스턴스가 ‘절대로’ 1 개밖에 존재하지 않는 것을 ‘보증’ 하고 싶을 때
 * 인스턴스가 1 개밖에 존재하지 않는 것을 프로그램 상에서 표현하고 싶을 때
 * 
 */
package SingletonPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Start");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if(obj1 == obj2) {
			System.out.println("obj1과 obj2는 같은 인스턴스");
		}
		else {
			System.out.println("obj1과 obj2는 다른 인스턴스");
		}
		System.out.println("End");
	}
}
