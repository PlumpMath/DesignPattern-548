/**
 * 파일명 : Main.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package StatePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		상태관리 관리 = new 상태관리();
		
		관리.이벤트진행(행동.먹다);
		관리.이벤트진행(행동.먹다);
		관리.이벤트진행(행동.잠자러가다);
		관리.이벤트진행(행동.소화하다);
		관리.이벤트진행(행동.잠자러가다);
	}
}
