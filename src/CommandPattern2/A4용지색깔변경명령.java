/**
 * 파일명 : A4용지색깔변경명령.java
 * 작성일 : 2015. 8. 30.
 * 파일설명 : 
 */
package CommandPattern2;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class A4용지색깔변경명령 implements 재실행및실행취소명령 {
	private final A4용지 A4;
	private final String 새로운색깔;
	private final String 이전색깔;
	
	public A4용지색깔변경명령(A4용지 A4, String 새로운색깔) {
		this.A4 = A4;
		this.이전색깔 = A4.get색깔();
		this.새로운색깔 = 새로운색깔;
	}
	@Override
	public void 재실행() {
		A4.set색깔(새로운색깔);
	}
	@Override
	public void 실행취소() {
		A4.set색깔(이전색깔);
	}
}
