/**
 * 파일명 : Main.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package FacadePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		Audio audio = new Audio();
		Light light = new Light();

		Home home = new Home(tv, audio, light);

		home.enjoyTv();
		home.enjoyMusic();
		home.goOut();
	}
}
