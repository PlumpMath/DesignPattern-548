/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 30.
 * 파일설명 : 
 */
package FlyweighPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

/*
Flyweight 는 동일한 것을 공유해서 객체 생성을 줄여 가볍게 만드는 것입니다. 
클래스 별로 factory를 씁니다. 그리고 그 factory에서는 자신이 찍어내는 객체들을 관리합니다. 
이미 가지고 있는 객체에 대한 요청이 들어왔을 때는 관리하고 있던 객체를 던져주고, 가지고 있지 않은 것을 요청하면 새로 객체를 만들어 관리 리스트에 추가시키고 던져줍니다.
*/
public class Main {
	public static void main(String[] args) {
		터미네이터 터미네이터01 = 터미네이터생성공장.get터미네이터("임승한");
		터미네이터 터미네이터02 = 터미네이터생성공장.get터미네이터("홍길동");
		터미네이터 터미네이터03 = 터미네이터생성공장.get터미네이터("임승한");
		
		System.out.println(터미네이터01 == 터미네이터02);	// false
		
		// 터미네이터01과 터미네이터03는 둘다 "임승한"이란 String을 이용해서 객체를 주문
		// 같은 String으로 객체를 주문했으므로 같은 객체가 리턴됩니다. 즉,두번째 요청에서는 새로 생성하지 않습니다.
		// "이미 가지고 있는 객체에 대한 요청이 들어왔을 때는 관리하고 있던 객체를 던져주고, 
		// 가지고 있지 않은 것을 요청하면 새로 객체를 만들어 관리 리스트에 추가시키고 던진다."
		System.out.println(터미네이터01 == 터미네이터03);	// true
	}

}
