/**
 * 파일명 : CommandStack.java
 * 작성일 : 2015. 8. 30.
 * 파일설명 : 
 */
package CommandPattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class CommandStack {
	private int 현재 = -1;
	private List<재실행및실행취소명령> 명령어 = new ArrayList<재실행및실행취소명령>();
	
	public void 실행(재실행및실행취소명령 컨트롤명령) {
		for(int i=명령어.size()-1; i > 현재; i--) {
			명령어.remove(i);
		}
		명령어.add(컨트롤명령);
		재실행();
	}
	public void 재실행() {
		명령어.get(++현재).재실행();
	}
	public void 실행취소() {
		명령어.get(현재--).실행취소();
	}
}
