/**
 * 파일명 : 배트맨빌더.java
 * 작성일 : 2015. 8. 29.
 * 파일설명 : 
 */
package BuilderPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 복잡한 영웅 객체를 실제로 만들어내는 빌더의 구현체인 배트맨 찍어내는 클래스
public class 베트맨빌더 implements 빌더{
	private 영웅 베트맨;
	베트맨빌더() {
		베트맨 = new 영웅("베트맨");
	}
	
	public void 팔만들기() {
		베트맨.set팔("강철");
	}
	public void 다리만들기() {
		베트맨.set다리("무쇠");
	}
	public 영웅 결과물보여줘() {
		
		return 베트맨;
	}
}
