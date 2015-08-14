/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 9.
 * 파일설명 : 바꿔서 재이용하기
 * 어댑터 패턴의 종류
 * (1) 클래스에 의한 Adapter 꽤턴(상속을 사용한 Adapter 패턴)
 * (2) 인스턴스에 의한 Adapter 때턴(위임을 사용한 Adapter 때턴)
 */
package AdapterPattern_Instance;

import AdapterPattern_Class.Print;
import AdapterPattern_Class.PrintBanner;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStorng();
	}
}


/* AdapterPattern 사용 이유

이미 만들어진 클래스를 새로운 인터페이스(API) 에 맞게 개조시킬 때는 당연히 Adapter
패턴을 사용해야 합니다. 그러나 실제 우리가 새로운 인터페이스(API)에 맞게 개조시킬 때
는 기존 클래스의 소스를 바꾸어서 '수정' 하려고 생각합니다. ‘이것을 조금 바꾸면 분명 작
업은 끝이다’ 라고 생각하기 쉽습니다. 그러나 그렇게하면 동작 테스트가 이미 끝난 기존의
클래스를 수정한 후에 다시 한번 태스트해야 합니다. Adapter 패턴은 기존의 클래스를 전
혀 수정하지 않고 목적한 인터페이스(API)에 맞추려는 것입니다. 또한 Adapter 패턴에서
는기존클래스의 소스프로그램이 반드시 펼요한것은아닙니다. 기존클래스의 사양만알
면 새로운 클래스를 만들 수 있습니다.

- 버전업과 호환성
소프트웨어는 버전 업이 필요합니다. 소프트웨어를 버전 업할 때는 ‘구 버전과의 호환성’ 이
문제가 됩니다. 구 버전을 버리면 소프트웨어의 유지와 보수는 편하지만 항상 그것이 가능할
순 없습니다. 구 벼전과 신 버전을 공존시키고 유지와 보수도 편하게 하기 위해서 Adapter
패턴이 도웅이 되는 경우가 있습니다. 예를 들어 앞으로는 신 버전만 유지와 보수를 하고 싶
을 때 신 벼전을 Adaptee 역할로 하고， 구 벼전을 Target 역할로 합니다. 그리고 신 버전의
클래스를 사용해서 구 버전의 메소드를 구현하는 Adapter 역할의 클래스를 만듭니다.

*/

