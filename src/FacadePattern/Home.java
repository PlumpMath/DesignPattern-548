/**
 * 파일명 : Home.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package FacadePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Home {
	private TV tv;
	private Audio audio;
	private Light light;

	public Home(TV tv, Audio audio, Light light) {
		this.tv = tv;
		this.audio = audio;
		this.light = light;
	}
	public void enjoyTv() {
		System.out.println("== 불을 밝게하고 TV보기 ==");
		light.setLightness(2);
		tv.turnOn();
	}
	public void enjoyMusic() {
		System.out.println("");
		System.out.println("== 불을 약간 어둡게하고 음악듣기 ==");
		audio.play();
	}
	public void goOut() {
		System.out.println("");
		System.out.println("== TV끄고, 음악도 끄고, 불도 끄고 외출하기");
		if(tv.isTurnedOn()) {
			tv.turnOff();
		}
		if(audio.isPlaying()) {
			audio.stop();
		}
		light.setLightness(0);
	}
}
