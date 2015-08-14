/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 11.
 * 파일설명 : 동작 테스트용 클래스
 */
package Main;

import Framework.Factory;
import Framework.Product;
import Idcard.IDCardFactory;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		// ???
		Factory factory = new IDCardFactory();
		Product card01 = factory.create("홍길동");
		Product card02 = factory.create("이순신");
		Product card03 = factory.create("강감찬");
		
		card01.use();
		card02.use();
		card03.use();
	}

}
