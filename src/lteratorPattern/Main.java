/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 27.
 * 파일설명 : 
 */
package lteratorPattern;

import java.util.Iterator;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
public class Main {
	public static void main(String[] args) {
		lteratorPattern person = new lteratorPattern();
		person.add("임승한");
		person.add("홍길동");
		person.add("아무개");
		
		Iterator<String> iterator = person.iterator();
		/*
		person의 원소들을 뽑아내는데, person이라는 변수를 전혀 쓰지 않는다. 
		물론, 내부적으로 iterator라는 변수가 person과 관계를 유지해주고 있지만, 
		일단 iterator를 가지고 온 후에는 데이터 집합체가 뭐냐에 신경을 쓸 필요가 진다. 
		iterator만 가져오면, 걍 hasNext() , next() 만 가지고 반복하면서 원소들에 대해서 처리를 하면 됨.
		*/
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}

}
