/**
 * 파일명 : 사람만드는공장.java
 * 작성일 : 2015. 8. 30.
 * 파일설명 : 
 */
package FlyweighPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class 터미네이터생성공장 {
	private static Map<String, 터미네이터> map = new HashMap<String, 터미네이터>();
	public synchronized static 터미네이터 get터미네이터(String 이름) {
		if(!map.containsKey(이름)) {
			터미네이터 새로운터미네이터 = new 터미네이터(이름);
			map.put(이름, 새로운터미네이터);
		}
		return map.get(이름);
	}
}
