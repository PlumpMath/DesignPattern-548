/**
 * 파일명 : 오리.java
 * 작성일 : 2015. 8. 29.
 * 파일설명 : 
 */
package StrategyPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public abstract class 오리 {
	// 행동을 추상화한 인터페이스 멤버변수
	private 날수있는 날수있는인터페이스;
	private 울수있는 울수있는인터페이스;
	
	// 오리마다 다른 모습
	public abstract void 누구냐넌();
	
	// 행동
	public void 푸드덕날다() {
		날수있는인터페이스.날다();
	}
	public void 꽥꽥울다() {
		울수있는인터페이스.울다();
	}
	
	// 행동 setter
	public void set날다(날수있는 행동) {
		this.날수있는인터페이스 = 행동;
	}
	
	public void set울다(울수있는 행동) {
		this.울수있는인터페이스 = 행동;
	}
	
	
}
