/**
 * 파일명 : Audio.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package FacadePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Audio {
	private boolean playing = false;
	public void play() {
		playing = true;
		System.out.println("음악을 연주");
	}
	public void stop() {
		playing = false;
		System.out.println("음악을 멈춤");
	}
	public boolean isPlaying() {
		return playing;
	}
}
