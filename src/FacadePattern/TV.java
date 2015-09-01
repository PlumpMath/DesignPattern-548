/**
 * 파일명 : TV.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package FacadePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class TV {
	private boolean turnedOn = false;
	public void turnOn() {
		turnedOn = true;
		System.out.println("TV를 켬");
	}
	public void turnOff() {
		turnedOn = false;
		System.out.println("TV를 끔");
	}
	public boolean isTurnedOn() {
		return turnedOn;
	}
}
