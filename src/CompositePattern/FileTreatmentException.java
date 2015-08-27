/**
 * 파일명 : FileTreatmentException.java
 * 작성일 : 2015. 8. 23.
 * 파일설명 : 파일에 대해서 add 메소드를 잘못 호출했을 때 제공되는 사용자 정의 예외
 */
package CompositePattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class FileTreatmentException extends RuntimeException {
	public FileTreatmentException() {}
	public FileTreatmentException(String msg) {
		super(msg);
	}
}
