/**
 * 파일명 : Entry.java
 * 작성일 : 2015. 8. 23.
 * 파일설명 : 
 */
package CompositePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// Component 역할
// Leaf 역할과 Composite 역할을 동시헤 하는 역할을 담당.
// Component는 Leaf 역할과 Composite 역할에 공통적인 상위 클래스로 실현.
public abstract class Entry {

	/*
	getName이나 getSize는 추상 메소드이지만 
	하위 클래스에서 이 두 메소드를 구현하며 toString에서 호출하고 있다(Template Method 패턴)
	*/
	public abstract String getName();		// 이름을 얻는다.
	public abstract int getSize();			// 크기를 얻는다.
	public Entry add(Entry entry) throws FileTreatmentException {
		
		// 엔트리를 추가한다.
		throw new FileTreatmentException();
	}
	
	// 메소드 오버로드(Overload, 다중정의)라고
	
	public void printList() {				// 일람을 표시한다.
		printList("");	
	}
	
	// prefix를 앞에 붙여 종류를 표시한다.
	// protected로 Entry의 하위 클래스에서만 사용하도록 되어 있다.
	protected abstract void printList(String prefix);
	
	
	// ex) /root/bin (30000)
	public String toString() {				// 문자열 표현
		return getName() + " (" + getSize() + ")";
	}
	
}
