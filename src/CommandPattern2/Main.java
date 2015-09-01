/**
 * 파일명 : Main.java
 * 작성일 : 2015. 8. 30.
 * 파일설명 : 
 */
package CommandPattern2;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class Main {
	public static void main(String[] args) {
		A4용지 A4 = new A4용지();
		CommandStack stack = new CommandStack();
		
		stack.실행(new A4용지색깔변경명령(A4, "주황"));
		stack.실행(new A4용지색깔변경명령(A4, "노랑"));
		stack.실행(new A4용지색깔변경명령(A4, "초록"));
		
		System.out.println("");
		System.out.println("두번 실행취소");
		stack.실행취소();
		stack.실행취소();
		
		System.out.println("");
		System.out.println("재실행 한번");
		stack.재실행();
		
		System.out.println("");
		System.out.println("A4용지색 '파랑'으로 변경 실행");
		stack.실행(new A4용지색깔변경명령(A4, "파랑"));
	}
}
