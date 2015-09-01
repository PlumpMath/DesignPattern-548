/**
 * 파일명 : 동물공장.java
 * 작성일 : 2015. 8. 31.
 * 파일설명 : 
 */
package FactoryMethodPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class 동물공장 {
	// 여기서 '동물'은 인터페이스. 즉, 객체타입은 '동물'
	public static 동물 create(String 동물이름) {
		if(동물이름 == null) {
			throw new IllegalArgumentException("null안됨 ㅃㅃ");
		}
		if(동물이름.equals("소")) {
			return new 소();
		} else if(동물이름.equals("고양이")) {
			return new 고양이();
		} else if(동물이름.equals("개")) {
			return new 개();
		} else {
			return null;
		}
	}
}
