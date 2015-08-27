/**
 * 파일명 : File.java
 * 작성일 : 2015. 8. 23.
 * 파일설명 : 파일을 표현하는 클래스
 */
package CompositePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// File 클래스
// Leaf(나뭇잎)의 역할
// '내용물'을 표시하는 역할을 하며 내부에는 다른 것을 넣을 수 없다.
public class File extends Entry {
	private String name;
	private int size;
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
	/* 
	 *  java 언어 사양 - 다음 식은 모두 동일
	 *  prefix + "/" + this
	 *  prefix + "/" + this.toString()
	 *  prefix + "/" + toString()
	 */
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}
}
