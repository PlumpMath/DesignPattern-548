/**
 * 파일명 : Child데코레이터.java
 * 작성일 : 2015. 8. 31.
 * 파일설명 : 
 */
package DecoratorPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Child데코레이터  extends 데코레이터 {
	private 데코레이터 꾸미는사람;
	public Child데코레이터(데코레이터 꾸미는사람) {
		this.꾸미는사람 = 꾸미는사람;
	}
	@Override
	public String get효과음() {
		return "뚜두둥..." + 꾸미는사람.get효과음() + "!!!!!!!!!!";
	}
}
