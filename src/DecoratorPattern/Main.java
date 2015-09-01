/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 31.
 * 파일설명 : 
 */
package DecoratorPattern;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		데코레이터 꾸미는사람 = new 데코레이터();
		System.out.println(꾸미는사람.get효과음());
		
		데코레이터 더꾸미는사람 = new Child데코레이터(꾸미는사람);
		System.out.println(더꾸미는사람.get효과음());
		
		데코레이터 더더꾸미는사람 = new Child데코레이터(더꾸미는사람);
		System.out.println(더더꾸미는사람.get효과음());
	}

}
