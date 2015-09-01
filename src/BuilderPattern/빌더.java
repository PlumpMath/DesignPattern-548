/**
 * 파일명 : 빌더.java
 * 작성일 : 2015. 8. 29.
 * 파일설명 : 
 */
package BuilderPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 복잡한 영웅 객체를 만들어내기 위한 객체 생성과정을 관리하는 빌더 인터페이스 
public interface 빌더 {
	void 팔만들기();
	void 다리만들기();
	영웅 결과물보여줘();
}
