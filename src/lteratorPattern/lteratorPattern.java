/**
 * 파일명 : Iterator.java
 * 작성일 : 2015. 8. 27.
 * 파일설명 : 
 */
package lteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class lteratorPattern implements Iterable<String> {
	private List<String> list = new ArrayList<String>();

	public void add(String name) {
		list.add(name);
	}

	public Iterator<String> iterator() {
		return list.iterator();
	}
	/*	list.iterator(); 를 풀어쓰면 아래와 같다
	 
	new Iterator<String>() {
		int seq = 0;

		public boolean hasNext() {
			return seq < list.size();
		}

		public String next() {
			return list.get(seq++);
		}
	};
	
	*/
}
