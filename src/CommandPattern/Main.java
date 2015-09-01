/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 30.
 * 파일설명 : 
 */
package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		List<명령> 명령어 = new ArrayList<명령>();
		
		명령어.add(new 명령() {
			@Override
			public void 실행() {
				System.out.println("실행했음");
			}
		});
		
		명령어.add(new 명령(){
			@Override
			public void 실행() {
				System.out.println("시장가서 어묵먹기!");
			}
		});
		
		// 여기서부터는 실행부
		for(명령 명령실행:명령어) {
			// 이놈은 자기가 실행시키는게 뭔지도 모른다.
			명령실행.실행();
		}
	}
}
