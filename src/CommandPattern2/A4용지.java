/**
 * 파일명 : A4용지.java
 * 작성일 : 2015. 8. 30.
 * 파일설명 : 
 */
package CommandPattern2;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 초기색은 빨강
public class A4용지 {
	private String 색깔 = "빨강";
	public String get색깔() {
		return 색깔;
	}
	public void set색깔(String 색깔) {
		System.out.println(this.색깔 + "에서 " + 색깔 + "으로 색깔 바뀜");
		this.색깔 = 색깔;
	}
}
