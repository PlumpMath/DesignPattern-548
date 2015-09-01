/**
 * 파일명 : 상태관리.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package StatePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class 상태관리 {
	private 상태 현재상태;
	public 상태관리(){
		현재상태 = 상태.get초기상태();
	}
	public void 이벤트진행(행동 행동) {
		상태 다음상태 = 현재상태.행동하다(행동);
		if(다음상태 != null){
			현재상태.onExit();
			System.out.println("'" + 행동+ "'" + "에 의해 상태가 " + 현재상태 + "에서 "
					+ "'" + 다음상태 + "'" + "로 바뀜");
			현재상태 = 다음상태;
			현재상태.onEntry();
			if(상태.is마지막상태(현재상태)){
				System.out.println("워메.. 마지막 상태에 도달혓네ㅊㅋㅊㅋ");
			}
		} else {
			System.out.println("'" + 행동 + "'" + "은(는) 상태가 " + 현재상태
					+ "에서는 부질없는 짓");
		}
	}
}
