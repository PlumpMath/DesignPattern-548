/**
 * 파일명 : 빌더관리자.java
 * 작성일 : 2015. 8. 29.
 * 파일설명 : 
 */
package BuilderPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class 빌더관리자 {
	private 빌더 빌더;
	public 빌더관리자(빌더 빌더) {
		this.빌더 = 빌더;
	}
	public void 빌더() {
		빌더.팔만들기();
		빌더.다리만들기();
	}
	public 영웅 get영웅() {
		return 빌더.결과물보여줘();
	}
}
