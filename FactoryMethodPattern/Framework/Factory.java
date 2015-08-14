/**
 * 파일명 : Factory.java
 * 작성일 : 2015. 8. 11.
 * 파일설명 : 메서드 create을 구현하고 있는 추상 클래스
 * Factory 클래스에서는 Template Method 패턴이 사용되고 있다.
 * createProduct에서는 '제품을 만들고', 
 * 만든 제품을 추상 메서드 registerProduct에서 '등록'한다.
 * '제품을 만들고', '등록'하는 구현은 하위 클래스에서 수행한다.
 */
package Framework;

/**
 * @author 임승한(lim_designer@naver.com)
 */

// 이 Framework에서 공장이란 'create 메서드에서 Product의 인스턴스를 생성하는 것'으로 규정하고 있다.

public abstract class Factory {
	// create 메서드는 'createProduct에서 제품을 만들어서 
	// registerProduct에서 등록한다'라는 순서로 구현되고 있다.
	public final Product create(String owner){
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}
