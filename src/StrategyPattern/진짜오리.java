/**
 * 파일명 : 진짜오리.java
 * 작성일 : 2015. 8. 29.
 * 파일설명 : 
 */
package StrategyPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 위와같이 상속을하면 인터페이스처럼 모든 메소드, 변수들을 생성해주지 않아도 다른 클래스(main)에서 오리 클래스 안의 메소드 등을 사용할 수 있다.
public class 진짜오리 extends 오리{
	public void 누구냐넌() {
		System.out.println("<진짜 오리>");
	}
}
