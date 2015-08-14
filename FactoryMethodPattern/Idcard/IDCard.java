/**
 * 파일명 : IDCard.java
 * 작성일 : 2015. 8. 11.
 * 파일설명 : 메서드 use를 구현하고 있는 클래스
 */
package Idcard;

import Framework.Product;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// IDCard 클래스를 제품 Product 클래스의 하위 클래스로 정의
public class IDCard extends Product {
	private String owner;
	IDCard(String owner){
		System.out.println(owner + "의 카드를 만든다.");
		this.owner = owner;
	}
	
	// overriding
	public void use() {
		System.out.println(owner + "의 카드를 사용한다.");
	}
	
	public String getOwner() {
		return owner;
	}
}
