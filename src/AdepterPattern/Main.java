/**
 * 파일명 : Main.java
 * 작성일 : 2015. 9. 1.
 * 파일설명 : 
 */
package AdepterPattern;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	// 뭔가 훌륭한 메소드
	public static void goodMethod(Enumeration<String> enu) {
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("아무개");
		Enumeration<String> ite = new IteratorToEnumeration(list.iterator());
		Main.goodMethod(ite);
	}
}
