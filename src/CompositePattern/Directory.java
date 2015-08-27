/**
 * 파일명 : Directory.java
 * 작성일 : 2015. 8. 23.
 * 파일설명 : 디렉터리를 표현하는 클래스
 */
package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 임승한(lim_designer@naver.com)
 *
 */
public class Directory extends Entry {
	private String name; // 디렉터리의 이름
	private ArrayList directory = new ArrayList(); // 디렉터리 엔트리의 집합

	public Directory(String name) { // 생성자
		this.name = name;
	}

	public String getName() { // 이름을 얻는다.
		return name;
	}

	public int getSize() { // 크기를 얻는다.
		int size = 0;
		Iterator it = directory.iterator();
		/*
		 * directory의 요소를 하나씩 꺼내서 그 크기를 합한 것이 반환값이 된다. 변수 Slze에 entηry의 크기를 더하고
		 * 있지만， 이 entry는 Fi1e의 인스턴스일지도 모르고 Directorγ의 인스턴스일지도 모른다. 두 경우 모두 통일한
		 * 메소드 getSize로 크기를 얻을수 있다. 이것이 Composite 패턴의 특정인 ‘그릇과 내용물의 통일시’를 나타내는
		 * 기법. Fi1e의 인스턴스이든, Directorγ의 인스턴스이든 entry는 어쨌든 Entry의 하위 클래스의 인스턴스이기
		 * 때문에 getSize를 안심하고 호출할 수 있습니다. Entry의 하위 클래스로서 다른 클래스가 만들어져도， getSize
		 * 메소드를 구현하고 있기 때문에 Directory 클래스의 이 부분을 수정할 필요가 없다.
		 * 
		 * entry가 Directioη의 인스턴스인 경우 entry.getSize()라는 식을 평가하면 Directory 안의
		 * 엔트리의 크기를 하나하나 더한다. 또 그 안에 디렉터리가 있다면 다시 하위 디렉터리의 getSize를 호출하고 ... 이렇게
		 * 재귀적으로 getsize 메소드가 호출된다. Composite 패턴의 재귀적 구조가 그대로 getSize라는 메소드의 재귀적
		 * 호출에 대응하고 있음을 알 수 있다.
		 */
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			size += entry.getSize();
		}
		return size;
	}

	/*
	 * add 메소드는 디렉터리 안에 파일이나 디렉터리를 추가하기 위한 것. 인수로서 주어진 entry는 그것이 실제로 Directory
	 * 클래스의 인스턴스인지， File 클래스의 인스턴스인지 조사할 필요없이 directory.add(entry); 로 directoη
	 * 필드에 추가된다. ‘추가한다’ 라는 조작은 ArrayList에 위임하고 있다고 할 수 있다.
	 */
	public Entry add(Entry entry) { // 엔트리의 추가
		directory.add(entry);
		return this;
	}

	/*
	 * printList 메소드는 디렉터리의 종류를 표시. printList 메소드도 getSize 메소드와 통일하게 printList를
	 * 재귀적으로 호출하고 있다. 그 사이에 변수 entry가 Fi1e의 인스턴스인지， Directory의 인스턴스인지 조사하지 않는 것도
	 * getSize 메소드의 경우와 동일. 그릇과 내용물이 동일시되고 있기 때문.
	 */
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.printList(prefix + "/" + name);
		}
	}
}
