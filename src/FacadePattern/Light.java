/**
 * 파일명 : Light.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package FacadePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Light {
	private int lightness = 0;
	public int getLightness() {
		return lightness;
	}
	public void setLightness(int lightness) {
		System.out.println("밝기를" + lightness + "로 변경");
		this.lightness = lightness;
	}
}
