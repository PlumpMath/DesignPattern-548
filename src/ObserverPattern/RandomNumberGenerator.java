/**
 * 파일명 : RandomNumberGenerator.java
 * 작성일 : 2015. 8. 14.
 * 파일설명 : 랜덤으로 수를 생성하는 클래스.
 */
package ObserverPattern;

import java.util.Random;

/**
 * @author 임승한(lim_designer@naver.com)
 */
public class RandomNumberGenerator extends NumberGenerator{
	
	private Random random = new Random();	// 난수 발생기
	private int number;						// 현재의 수
	public int getNumber() {
		return number;
	}
	
	
	// execute 메소드는 난수(0~49의 범위의 정수)를 20개 생성하고， 
	// 그때마다 notifyObservers를 사용해서 관찰자에게 통지한다.
	public void execute() {
		for(int i=0; i<20; i++) {
			// random.nextInt(50) :: 0~49의 범위의 정수
			number = random.nextInt(50);	
			notifyObservers();
		}
	}
}
