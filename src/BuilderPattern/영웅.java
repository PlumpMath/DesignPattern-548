/**
 * 파일명 : 영웅.java
 * 작성일 : 2015. 8. 29.
 * 파일설명 : 
 */
package BuilderPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class 영웅 {
	private String 팔재료;
	private String 다리재료;
	private String 이름;
	
	public 영웅(String 이름) {
		super();
		this.이름 = 이름;
	}
	public void set팔(String 팔재료) {
		this.팔재료 = 팔재료;
	}
	public void set다리(String 다리재료) {
		this.다리재료 = 다리재료;
	}
	public void 결과물보여줘() {
		System.out.println(팔재료 + "로만든 팔과" + 다리재료 + "로 만든 다리를 가진" + 이름);
	}
}
