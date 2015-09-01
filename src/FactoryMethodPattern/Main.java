/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 31.
 * 파일설명 : 
 */
package FactoryMethodPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		동물 동물01 = 동물공장.create("소");
		동물01.해당동물을설명한다();
		동물 동물02 = 동물공장.create("고양이");
		동물02.해당동물을설명한다();
		동물 동물03 = 동물공장.create("개");
		동물03.해당동물을설명한다();
	}
}
