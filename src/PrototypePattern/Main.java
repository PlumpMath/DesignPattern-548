/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 29.
 * 파일설명 : 
 */
package PrototypePattern;

import java.util.Date;

/**
 * @author 임승한(lim_designer@naver.com)
 */
/*
 * 기존에 만들어진 복잡다난한 인스턴스의 내용이 일부만 살짝 변경된 비스무레한 객체가 필요한 경우에 쓰입니다. 일반적으로 객체를 새로 생성할
 * 때는 new Object()와 같은 방법으로 생성을 합니다. 그러나 그렇게 생성할 경우 기존에 만들어진 것과 유사하다고 해도 결국 모든
 * 정보를 다시 세팅해주어야 합니다. 그러나, clone()을 이용할 경우에는 기존에 만들어진 것을 복사해서 바뀐 부분만 대체해 주면
 * 인스턴스를 생성하기가 쉽습니다. 아주 일반적인 "원형"을 만들어서 그것을 복사한 후 적당히 커스터마이징을 하면 new로 객체를 생성하는
 * 것보다 쉽게 됩니다.
 * 
 * - Prototype 패턴 - 팩토리 패턴과 조합해서 쓰는 게 일반적입니다. Factory 클래스에서 원형을 관리하고, 그 Factory의
 * create 메쏘드가 호출되면, 원형으로부터 복사해서 외부로 던져주는 겁니다. Prototype은 Factory에서만 관리되고 그 외부로
 * 드러나지 않습니다. clone() 메쏘드가 호출되어 새로운 객체가 생성되는 시점에 원형이 어찌 생겼는지 크게 신경쓰지 않습니다. 그냥
 * 다짜고짜 복사할 뿐입니다.
 */

public class Main {
	public static void main(String[] args) {
		복잡한정보클래스 원형 = new 복잡한정보클래스("매우 복잡한 정보");
		try {
			복잡한정보클래스 복사본01 = (복잡한정보클래스)원형.clone();
			복사본01.set날짜(new Date(2015, 8, 30));

			복잡한정보클래스 복사본02 = (복잡한정보클래스)원형.clone();
			복사본02.set날짜(new Date(2015, 8, 31));

			System.out.println(복사본01.get날짜());
			System.out.println(복사본02.get날짜());
			
			System.out.println(복사본01.get복잡한정보() + " + 알파01");
			System.out.println(복사본02.get복잡한정보() + " + 알파02");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
